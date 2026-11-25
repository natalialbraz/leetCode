package plans.hackerhank.palindrome_filtering_non_letters

class Solution {

    /*
 * Complete the 'isAlphabeticPalindrome' function below.
 *
 * The function is expected to return a BOOLEAN.
 * The function accepts STRING code as parameter.
 */

    fun isAlphabeticPalindrome(code: String): Boolean {
        val cleanString = code.filter { it.isLetter() }.lowercase()
        var pointer = cleanString.length-1
        for (i in 0 until cleanString.length-1/2){
            if (cleanString[i] != cleanString[pointer]) return false
            pointer--
        }
      return true

    }
}