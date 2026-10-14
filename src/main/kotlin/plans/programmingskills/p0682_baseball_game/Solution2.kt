package plans.programmingskills.p0682_baseball_game

class Solution2 {
    fun calPoints(operations: Array<String>): Int {
        val record = mutableListOf<Int>()

        for (op in operations) {
            when (op) {
                "+" -> record.add(record[record.size - 1] + record[record.size - 2])
                "D" -> record.add(record.last() * 2)
                "C" -> record.removeAt(record.lastIndex)
                else -> record.add(op.toInt())
            }
        }

        return record.sum()
    }
}