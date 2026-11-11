package plans.coderbyte.codeland_username_validation

class Solution {
    fun CodelandUsernameValidation(str: String): String {
        if (str.length !in 4..25) return "false"
        val startsWithLetter  = str.first().isLetter()
        val doesNotEndWithUnderscore  = str.last() != '_'
        val onlyValidChars = str.all { it.isLetterOrDigit() || it == '_' }

        return if (startsWithLetter  && doesNotEndWithUnderscore  && onlyValidChars) "true" else "false"

    }

}