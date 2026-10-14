package plans.topinterview150.p0189_rotate_array

/**
 * 189. Rotate Array (Medium)
 * https://leetcode.com/problems/rotate-array/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val actualK = k % n  // ← FIX CRUCIAL!

        if (actualK == 0) return  // Otimização: se k é múltiplo de n, não muda nada

        var j = 0
        val buffer = IntArray(actualK)  // ← Agora usa actualK, não k!

        // Passo 1: Salvar últimos actualK elementos
        for (i in n - actualK until n) {
            buffer[j] = nums[i]
            j++
        }

        // Passo 2: Mover elementos para direita (DE TRÁS PARA FRENTE!)
        for (i in n - actualK - 1 downTo 0) {
            nums[i + actualK] = nums[i]
        }

        // Passo 3: Colocar buffer no início
        for (i in buffer.indices) {
            nums[i] = buffer[i]
        }
    }
}