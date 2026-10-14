package plans.programmingskills.p1491_average_salary_excluding_the_minimum_and_maximum_salary

/**
 * 1491. Average Salary Excluding the Minimum and Maximum Salary (Easy)
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun average(salary: IntArray): Double {

        var min = 1000000000
        var max = 0
        var sum = 0

        for (i in salary.indices) {
            if (salary[i] <= min) min = salary[i]
            if (salary[i] >=  max) max = salary[i]
            sum += salary[i]
        }

        sum = sum -max - min

        return sum.toDouble()/(salary.size-2)

    }
}