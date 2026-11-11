package plans.hackerhank.pangram

class Solution {

    fun pangrams(s: String): String {
        val letter = HashSet<Char>()
        s.lowercase().forEach{
            if (it in 'a'..'z') {
                letter.add(it)
            }

        }
        return if (letter.size == 26) "pangram" else "not pangram"

    }


}