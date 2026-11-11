package plans.hackerhank.hr_in_a_string

class Solution {
    fun hackerrankInString(s: String): String {
        val target = "hackerrank"
        var j = 0
        for (c in s) {
            if (c == target[j]) {
                j++
                if (j == target.length) return "YES"
            }
        }

        return "NO"
    }

}