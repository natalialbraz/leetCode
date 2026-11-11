package plans.coderbyte.find_intersection_s2

class Solution {
    fun FindIntersection(strArr: Array<String>): String {
        val list = strArr.map { str ->
            str.split(", ")
        }
        val element1 = list[0]
        val element2 = list[1]
        val result = mutableListOf<String>()
        val secondSet = HashSet<String>()

        element2.forEach {
            secondSet.add(it)
        }
        element1.forEach {
            if (secondSet.contains(it)) {
                result.add(it)
            }
        }

        return result.joinToString(", ").ifEmpty { "false" }

    }
}

