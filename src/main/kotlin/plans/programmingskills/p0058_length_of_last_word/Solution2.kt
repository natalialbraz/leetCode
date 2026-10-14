package plans.programmingskills.p0058_length_of_last_word

class Solution2 {
    fun lengthOfLastWord(s: String): Int {
        val words = s.trim().split(" ")
        return words.last().length
    }
}