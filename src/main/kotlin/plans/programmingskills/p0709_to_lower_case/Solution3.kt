package plans.programmingskills.p0709_to_lower_case

class Solution3 {
    fun toLowerCase(s: String): String {
        val sb = StringBuilder()
        for (char in s) {
            sb.append(if (char in 'A'..'Z') char.lowercaseChar() else char)
        }
        return sb.toString()
    }
}