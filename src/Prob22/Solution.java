package Prob22;

import java.util.*;

/**
 * generateParanthesis(1) => ()
 * f(2) = encapsulate (f(1)) = (()) , concatenate ()()
 * f(3) = encapsulate (f(2)) = ((())), (()()) , concatenate () + f(2), ()(()), ()()(), f(2) + () => (())() ()()()
 * ((())) (()())
 * ()(()) ()()()
 * (())()
 *
 * (((()))) ((()())) (()(())) (()()()) ((())())
 * ()((())) ()(()()) ()()(()) ()()()() ()(())()
 */

class Solution {
    HashMap<Integer, List<String>> meme = new HashMap<>();
    HashMap<Integer, List<String>> mem = new HashMap<>();

    public List<String> generateParenthesis(int n) {
        if (mem.containsKey(n))  return mem.get(n);
        ArrayList<String> results = new ArrayList<>();
        ArrayList<String> enclosures = new ArrayList<>();

        if (n == 1) {
            results.add("()");
            enclosures.add("()");
        } else {
            // encapsulate
            var prev = generateParenthesis(n-1);
            String r;
            for(var i : prev) {
                results.add(r = ("(" + i + ")"));
                enclosures.add(r);
            }

            for (int i = 1; i < n ; i++) {
                for(var e: meme.get(i)) {
                    for(var j: mem.get(n-i)) {
                        results.add(e + j);
                    }
                }
            }
        }

        mem.put(n, results);
        meme.put(n, enclosures);
        return mem.get(n);
    }
}