package plans.phase1easy.p0125_valid_palindrome

class Solution {

    fun isPalindrome(s: String): Boolean {
        val formated = s.lowercase().filter { it.isLetterOrDigit() }
        var size = formated.length - 1

        for (c in 0 until formated.length/ 2) {
            if (formated[c] != formated[size]) return false
            size--
        }
        return true

    }
}