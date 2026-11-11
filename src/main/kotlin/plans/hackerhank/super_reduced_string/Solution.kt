package plans.hackerhank.super_reduced_string

class Solution {

    fun superReducedString(s: String): String {
        val stack = ArrayDeque<Char>()
       for (c in s) {
           if (stack.isNotEmpty() && c == stack.last()) {
              stack.removeLast()
           } else {
               stack.addLast(c)
           }
       }

        return stack.joinToString("").ifEmpty { "Empty String" }
    }
}