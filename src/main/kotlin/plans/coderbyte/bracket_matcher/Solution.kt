package plans.coderbyte.bracket_matcher

class Solution {
    fun BracketMatcher(str: String): String {
        val stack = ArrayDeque<Char>()
        val cleanedString = str.filter { it == '(' || it == ')' }
        for (char in cleanedString) {
            if (char.isOpening()) {
                stack.addLast(char)
            }
            if (!char.isOpening()) {
                if (stack.isNotEmpty() && stack.last() == '(') {
                    stack.removeLast()
                } else {
                    return "0"
                }
            }

        }
        return if (stack.isEmpty()) "1" else "0"
    }

    fun Char.isOpening(): Boolean = this == '('

}