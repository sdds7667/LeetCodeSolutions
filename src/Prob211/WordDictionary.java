package Prob211;

import java.util.*;

/**
 * Problem: Create a data structure good for adding words, and matching, "." - any letter
 * <p>
 * 1) Since 0 <= word.length <= 500, we can create an array for each length
 */

class LetterNode {
    public char c;
    public boolean wordEnd;
    public Map<Character, LetterNode> nodes;

    public LetterNode(char c) {
        this.c = c;
        nodes = new HashMap<>();
    }

    public LetterNode(char c, boolean wordEnd) {
        this(c);
        this.wordEnd = wordEnd;
    }
}

class WordDictionary {


    LetterNode root;

    public WordDictionary() {
        root = new LetterNode(' ');
    }

    public void addWord(String word) {
        if (word.length() == 0) return;
        int letterIndex = 0;
        LetterNode currentNode = root;
        char c;
        while (letterIndex < word.length() && currentNode.nodes.containsKey(c = word.charAt(letterIndex))){
            currentNode = currentNode.nodes.get(c);
            letterIndex++;
        }
        for(;letterIndex < word.length(); letterIndex++) {
            var newNode = new LetterNode(c = word.charAt(letterIndex));
            currentNode.nodes.put(c, newNode);
            currentNode = newNode;
        }
        currentNode.wordEnd = true;
    }

    public boolean search(String word) {
        return search(word, 0, root);
    }

    public boolean search(String word, int startIndex, LetterNode node) {
        if (word.length() == 0) return false;
        var currentNode = node;
        char c;

        while (true){
            if (startIndex == word.length()) return currentNode.wordEnd;
            c = word.charAt(startIndex);
            if (c == '.') {
                for(var key: currentNode.nodes.entrySet()) {
                    if (search(word, startIndex + 1, key.getValue())) return true;
                }
                return false;
            } else if (currentNode.nodes.containsKey(c)){
                currentNode = currentNode.nodes.get(c);
                startIndex ++;
            }  else return false;
        }
    }

}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */