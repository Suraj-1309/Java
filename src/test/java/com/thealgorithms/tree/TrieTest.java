package com.thealgorithms.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Trie (Prefix Tree) implementation.
 * These tests verify insert, search, and prefix functionality.
 * Author: Suraj-1309
 * Github: https://github.com/Suraj-1309
 */
class TrieTest {

    /**
     * Test the insertion of words and searching for complete words.
     * Ensures that inserted words can be found and non-inserted words cannot.
     */
    @Test
    void testInsertAndSearch() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"), "apple should be found after insertion");
        assertFalse(trie.search("app"), "app should not be found unless explicitly inserted");
        trie.insert("app");
        assertTrue(trie.search("app"), "app should be found after insertion");
        assertFalse(trie.search("appl"), "appl should not be found unless explicitly inserted");
    }

    /**
     * Test the startsWith method for prefix queries.
     * Ensures prefixes are recognized even if not full words.
     */
    @Test
    void testStartsWith() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.startsWith("app"), "Prefix 'app' should be found in 'apple'");
        assertTrue(trie.startsWith("a"), "Prefix 'a' should be found in 'apple'");
        assertFalse(trie.startsWith("b"), "Prefix 'b' should not be found");
        trie.insert("banana");
        assertTrue(trie.startsWith("ban"), "Prefix 'ban' should be found in 'banana'");
    }
}
