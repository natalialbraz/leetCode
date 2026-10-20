package plans.phase1easy.p0009_palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val stringForm = x.toString()
        var size = stringForm.length-1
        for (i in 0 until stringForm.length/2) {
            if (stringForm[i] != stringForm[size]) return false
            size--
        }
        return true
    }
}