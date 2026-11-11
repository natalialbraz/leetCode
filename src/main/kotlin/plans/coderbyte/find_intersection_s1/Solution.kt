package plans.coderbyte.find_intersection_s1

class Solution {
    fun FindIntersection(strArr: Array<String>): String {
        val list = strArr.map { str ->
            str.split(", ")
        }
        val element1 = list[0]
        val element2 = list[1]
        val result = StringBuilder()

        for (number in element1) {
            if (element2.contains(number)) result.append("$number, ")
        }

        return result.toString().substringBeforeLast(",").ifEmpty { "false" }

    }
}

