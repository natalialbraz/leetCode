package plans.programmingskills.p1491_average_salary_excluding_the_minimum_and_maximum_salary

class Solution2 {
    fun average(salary: IntArray): Double {

        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var sum = 0

        for (i in salary.indices) {
            if (salary[i] < min) min = salary[i]
            if (salary[i] > max) max = salary[i]
            sum += salary[i]
        }

        sum = sum - max - min

        return sum.toDouble() / (salary.size - 2)

    }
}