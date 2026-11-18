package plans.topinterview150.p0088_merge_sorted_array

class Solution2 {
    // [1,2,3,0,0,0]
    // [2,5,6]
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var j = 0
        var i = 0
        var f = 0
        val finalArray = IntArray(m + n)

        if (m == 0) {
            nums2.copyInto(nums1)
            return
        }
        if (n == 0) {
            nums1.copyInto(nums1)
            return
        }
        while (f < m+n) {
            val takeFromNums1 = when {
                i >= m -> false          // nums1 acabou
                j >= n -> true           // nums2 acabou
                else -> nums1[i] <= nums2[j]
            }
            if (takeFromNums1) {
                finalArray[f] = nums1[i]
                i++
            } else {
                finalArray[f] = nums2[j]
                j++
            }
            f++
        }
        finalArray.copyInto(nums1)
    }

}