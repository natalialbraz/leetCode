package plans.programmingskills.p1502_can_make_arithmetic_progression_from_sequence

class Solution2 {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        var minValuePosition: Pair<Int, Int>

        if (arr.size == 1) return false

        if (arr.size == 2) return true

        for (k in 0 until arr.size - 1) {
            minValuePosition = arr[k] to k
            for (i in k + 1 until arr.size) {
                if (arr[i] < minValuePosition.first) minValuePosition = arr[i] to i
            }

            arr[minValuePosition.second] = arr[k]
            arr[k] = minValuePosition.first

        }

        for (i in 1 until arr.size-1) {
            if (arr[i] - arr[i-1] != arr[i+1] - arr[i]) return false
        }
        return true
    }
}