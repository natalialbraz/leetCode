package plans.hackerhank.mars_exploration

class Solution {

    fun marsExploration(s: String): Int {
        val original = "SOS".repeat(s.length/3)
        var count = 0
        var j = 0
        for (c in s) {
            if (c != original[j]) count++
            j++
        }
        return count
    }
}