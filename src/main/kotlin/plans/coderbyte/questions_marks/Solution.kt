package plans.coderbyte.questions_marks

class Solution {
    fun QuestionsMarks(str: String): String {
        var prevDigit = -1
        var prevIndex = -1
        var foundPair = false

        for (i in str.indices) {
            if (!str[i].isDigit()) continue
            val digit = str[i].digitToInt()
            if (prevDigit != -1 && prevDigit + digit == 10) {
                foundPair = true
                val between = str.substring(prevIndex + 1, i).count { it == '?' }
                if (between != 3 ) return "false"

            }
            prevDigit = digit
            prevIndex = i


        }
        return if (foundPair) "true" else "false"

    }
}