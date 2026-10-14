<#
.SYNOPSIS
    Scaffolds a new LeetCode problem: Solution.kt, SolutionTest.kt, a row in the
    plan's README, and refreshes the progress table in the root README.

.EXAMPLE
    .\scripts\new-problem.ps1 -Plan programming-skills -Number 13 -Title "Roman to Integer" -Difficulty Easy

.EXAMPLE
    # Problems outside a study plan (daily challenge, random practice)
    .\scripts\new-problem.ps1 -Plan daily -Number 1 -Title "Two Sum" -Difficulty Easy

.EXAMPLE
    # When the URL slug can't be derived from the title (leetcode.com/problems/powx-n/)
    .\scripts\new-problem.ps1 -Plan programming-skills -Number 50 -Title "Pow(x, n)" -Difficulty Medium -Slug powx-n
#>
param(
    [Parameter(Mandatory)] [string] $Plan,
    [Parameter(Mandatory)] [int]    $Number,
    [Parameter(Mandatory)] [string] $Title,
    [Parameter(Mandatory)] [ValidateSet("Easy", "Medium", "Hard")] [string] $Difficulty,
    [string] $Slug
)

$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $PSScriptRoot
$utf8 = New-Object System.Text.UTF8Encoding($false)

function Write-Utf8($path, $text) {
    [System.IO.File]::WriteAllText($path, $text, $utf8)
}

# "programming-skills" -> package "programmingskills", display "Programming Skills"
$planPackage = ($Plan.ToLower() -replace '[^a-z0-9]', '')
$planName = (Get-Culture).TextInfo.ToTitleCase(($Plan -replace '[-_]', ' ').ToLower())

# "Roman to Integer" -> "roman-to-integer" -> "p0013_roman_to_integer"
$slug = if ($Slug) { $Slug } else { ($Title.ToLower() -replace '[^a-z0-9]+', '-').Trim('-') }
$problemPackage = "p{0:D4}_{1}" -f $Number, ($slug -replace '-', '_')
$package = "plans.$planPackage.$problemPackage"
$url = "https://leetcode.com/problems/$slug/"

$mainPlanDir = Join-Path $root "src/main/kotlin/plans/$planPackage"
$mainDir = Join-Path $mainPlanDir $problemPackage
$testDir = Join-Path $root "src/test/kotlin/plans/$planPackage/$problemPackage"

if (Test-Path $mainDir) {
    Write-Host "Already exists: $mainDir" -ForegroundColor Yellow
    exit 1
}
New-Item -ItemType Directory -Force $mainDir, $testDir | Out-Null

Write-Utf8 (Join-Path $mainDir "Solution.kt") @"
package $package

/**
 * $Number. $Title ($Difficulty)
 * $url
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    // Paste your LeetCode solution here
}
"@

Write-Utf8 (Join-Path $testDir "SolutionTest.kt") @"
package $package

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    @Test
    fun examples() {
        // Copy the examples from the problem description, e.g.
        // assertEquals(expected, solution.method(input))
    }
}
"@

# Plan README: one row per problem
$planReadme = Join-Path $mainPlanDir "README.md"
if (-not (Test-Path $planReadme)) {
    Write-Utf8 $planReadme @"
# $planName

| # | Problem | Difficulty | Solution |
|---|---------|------------|----------|

"@
}
$row = "| $Number | [$Title]($url) | $Difficulty | [Kotlin]($problemPackage/Solution.kt) |"
$content = [System.IO.File]::ReadAllText($planReadme, $utf8).TrimEnd()
Write-Utf8 $planReadme "$content`n$row`n"

# Root README: regenerate the progress table between the markers
$rootReadme = Join-Path $root "README.md"
$plansRoot = Join-Path $root "src/main/kotlin/plans"
$total = 0
$lines = @("| Study plan | Solved |", "|------------|--------|")
foreach ($dir in Get-ChildItem $plansRoot -Directory | Sort-Object Name) {
    $count = @(Get-ChildItem $dir.FullName -Directory -Filter "p*").Count
    $total += $count
    $readme = Join-Path $dir.FullName "README.md"
    $name = $dir.Name
    if (Test-Path $readme) {
        $name = ([System.IO.File]::ReadAllLines($readme, $utf8)[0]) -replace '^#\s*', ''
    }
    $lines += "| [$name](src/main/kotlin/plans/$($dir.Name)) | $count |"
}
$lines += "| **Total** | **$total** |"

$readmeText = [System.IO.File]::ReadAllText($rootReadme, $utf8)
$table = "<!-- progress:start -->`n" + ($lines -join "`n") + "`n<!-- progress:end -->"
$readmeText = [regex]::Replace($readmeText, '(?s)<!-- progress:start -->.*?<!-- progress:end -->', $table)
Write-Utf8 $rootReadme $readmeText

Write-Host "Created $package" -ForegroundColor Green
Write-Host "  $mainDir\Solution.kt"
Write-Host "  $testDir\SolutionTest.kt"
