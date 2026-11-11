package plans.coderbyte.first_reverse

class Solution {

    fun FirstReverse(str: String): String {
        val list = str.split(" ")
        val newList = mutableListOf<String>()
        for (i in list.size-1 downTo 0) {
            newList.add(list[i].reversed())
        }

        return newList.joinToString(" ")

    }
}