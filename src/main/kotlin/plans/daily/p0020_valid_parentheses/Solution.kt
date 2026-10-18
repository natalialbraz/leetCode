package plans.daily.p0020_valid_parentheses

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (bracket in s) {
            if (isOpen(bracket)) {
                stack.addLast(bracket)
            }
            if (isClosed(bracket)) {
                if (stack.isNotEmpty() && isTheSameType(stack.last(), bracket)) {
                    stack.removeLast()
                } else {
                    return false
                }

            }
        }
        return stack.isEmpty()
    }

    fun isTheSameType(symbol1: Char, symbol2: Char): Boolean {
        return when {
            symbol1 == '{' -> symbol2 == '}'
            symbol1 == '(' -> symbol2 == ')'
            symbol1 == '[' -> symbol2 == ']'
            else -> false
        }
    }

    fun isOpen(symbol: Char) = symbol == '{' || symbol == '(' || symbol == '['
    fun isClosed(symbol: Char) = symbol == '}' || symbol == ')' || symbol == ']'
}