package plans.phase1easy.first_unique_character

class Solution {
    fun firstUniqChar(s: String): Int {
        val seen = mutableMapOf<Char, Int>()

        for (char in s) {
            val count = seen.getOrDefault(char, 0)
            seen[char] = count + 1
        }

        for (i in s.indices) {
            if (seen[(s[i])]==1) return i
        }

        return -1
    }
}