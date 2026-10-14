package plans.programmingskills.p1275_find_winner_on_a_tic_tac_toe_game

/**
 * 1275. Find Winner on a Tic Tac Toe Game (Easy)
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun tictactoe(moves: Array<IntArray>): String {

        val board = Array(3) { IntArray(3) }

        for (indice in moves.indices) {
            val row = moves[indice][0]
            val col = moves[indice][1]  // second element = col
            if (indice % 2 == 0) {
                board[row][col] = 1   // A's move
            } else {
                board[row][col] = -1  // B's move
            }
        }

        fun checkWinner(player: Int): Boolean {
            // check rows and columns
            for (i in 0..2) {
                if (board[i][0] + board[i][1] + board[i][2] == player * 3) return true
                if (board[0][i] + board[1][i] + board[2][i] == player * 3) return true
            }
            // check diagonals
            if (board[0][0] + board[1][1] + board[2][2] == player * 3) return true
            if (board[0][2] + board[1][1] + board[2][0] == player * 3) return true

            return false
        }

        return when {
            checkWinner(1) -> "A"
            checkWinner(-1) -> "B"
            moves.size == 9 -> "Draw"
            else -> "Pending"
        }
    }
}