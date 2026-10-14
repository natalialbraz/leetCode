package plans.programmingskills.p0860_lemonade_change

class Solution3 {
    fun lemonadeChange(bills: IntArray): Boolean {
        val cashRegister = mutableListOf<Int>()

        for (bill in bills) {
            when (bill) {
                5 -> cashRegister.add(5)
                10 -> {
                    val five = cashRegister.lastIndexOf(5)
                    if (five == -1) return false
                    cashRegister.removeAt(five)
                    cashRegister.add(10)
                }
                20 -> {
                    val ten = cashRegister.lastIndexOf(10)
                    val five = cashRegister.lastIndexOf(5)
                    when {
                        ten != -1 && five != -1 -> {
                            cashRegister.removeAt(ten)
                            cashRegister.removeAt(cashRegister.lastIndexOf(5))
                            cashRegister.add(20)
                        }
                        cashRegister.count { it == 5 } >= 3 -> {
                            repeat(3) { cashRegister.removeAt(cashRegister.lastIndexOf(5)) }
                            cashRegister.add(20)
                        }
                        else -> return false
                    }
                }
            }
        }
        return true
    }
}