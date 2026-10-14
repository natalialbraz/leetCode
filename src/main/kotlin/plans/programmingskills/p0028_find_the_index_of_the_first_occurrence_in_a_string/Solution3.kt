package plans.programmingskills.p0028_find_the_index_of_the_first_occurrence_in_a_string

class Solution3 {
    fun strStr(haystack: String, needle: String): Int {
        val h = haystack.length
        val n = needle.length

        if (h < n) return -1

        // Try each starting position
        for (i in 0 .. h - n) {
            var match = true

            // Check if characters match
            for (j in needle.indices) {
                if (haystack[i + j] != needle[j]) {
                    match = false
                    break
                }
            }

            if (match) return i
        }

        return -1
    }
}