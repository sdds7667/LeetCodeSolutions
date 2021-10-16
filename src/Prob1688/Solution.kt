package Prob1688

import kotlin.math.max

class Solution {
    fun maxRepeating(sequence: String, word: String) : Int {

        var maxRes = 0
        for (si in sequence.indices) {
            var nsi = si
            var wi = 0
            while (nsi < sequence.length && sequence[nsi++] == word[wi++ % word.length]) continue
            maxRes = if (nsi == sequence.length && sequence[nsi-1] == word[wi-1]) {
                max(wi / word.length, maxRes)
            } else {
                max((wi - 1) / word.length, maxRes);
            }
        }
        return maxRes;
    }
}