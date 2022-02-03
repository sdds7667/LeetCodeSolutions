package Prob211;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    public void addWord() {
        var dict = new WordDictionary();
        dict.addWord("abc");
        dict.addWord("ab");
        dict.addWord("abb");
        dict.addWord("aaaaa");
        dict.addWord("bca");
        dict.addWord("z");

        assertTrue(dict.search("bca"));
        assertFalse(dict.search("aa"));
        assertTrue(dict.search("ab"));
        assertTrue(dict.search("a.c"));
        assertTrue(dict.search("..c"));
        assertTrue(dict.search("..."));
        assertFalse(dict.search("a"));
        assertTrue(dict.search("z"));
        assertTrue(dict.search("."));
        assertFalse(dict.search(""));

    }

}