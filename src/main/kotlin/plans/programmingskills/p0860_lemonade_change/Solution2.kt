package plans.programmingskills.p0860_lemonade_change

class Solution2 {
    fun lemonadeChange(bills: IntArray): Boolean {
        var fives = 0
        var tens = 0
        for (bill in bills) {
            when (bill) {
                5 -> fives++
                10 -> {
                    if (fives > 0) {
                        fives--
                        tens++
                    } else {
                        return false
                    }

                }

                20 -> {
                    when {
                        tens > 0 && fives > 0 -> {
                            tens--
                            fives--
                        }

                        fives >= 3 -> {
                            fives -= 3
                        }
                        else -> return false
                    }
                }
            }

        }
        return true
    }
}