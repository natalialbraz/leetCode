package plans.hackerhank.grading_students

import plans.hackerhank.grading_students.Solution.MagicNumbers.MULTIPLE
import plans.hackerhank.grading_students.Solution.MagicNumbers.PASSING_GRADE
import plans.hackerhank.grading_students.Solution.MagicNumbers.ROUNDING_THRESHOLD
import kotlin.collections.toTypedArray

class Solution {

    object MagicNumbers{
         const val PASSING_GRADE = 38
         const val ROUNDING_THRESHOLD = 3
         const val MULTIPLE = 5
    }

    fun gradingStudents(grades: Array<Int>): Array<Int> {
        val roundedGrades = grades.map { grade ->
            roundGrade(grade)
        }
        return roundedGrades.toTypedArray()
    }

    fun roundGrade(grade: Int): Int {

        val differenceToNext = findDifferenceToNextMultiple(grade)
        return when {
            grade < PASSING_GRADE -> grade
            differenceToNext < ROUNDING_THRESHOLD -> grade + differenceToNext
            else -> grade

        }
    }

    fun findDifferenceToNextMultiple(number: Int): Int = MULTIPLE - number % MULTIPLE


}