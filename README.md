# LeetCode in Kotlin

![tests](https://github.com/<your-username>/leetcode/actions/workflows/tests.yml/badge.svg)

My LeetCode solutions in Kotlin, organized by study plan.

## Structure

```
src/main/kotlin/plans/
└── <study-plan>/
    ├── README.md                    ← problem list for the plan
    └── p0013_roman_to_integer/
        └── Solution.kt              ← same class LeetCode expects
src/test/kotlin/plans/
└── <study-plan>/
    └── p0013_roman_to_integer/
        └── SolutionTest.kt
```

Problems that aren't part of a study plan (daily challenges, random practice) go in the `daily` plan.

## Adding a problem

```powershell
.\scripts\new-problem.ps1 -Plan programming-skills -Number 13 -Title "Roman to Integer" -Difficulty Easy
```

This creates the solution and test files, adds a row to the plan's README, and updates the progress table above.

## Running tests

```powershell
.\gradlew test
```
