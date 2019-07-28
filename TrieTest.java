package com.codingdojo.tries;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        System.out.println("all the keys in the Trie");
        trie.printAllKeys();
        System.out.println(trie.isPrefixValid("a"));
        System.out.println(trie.isPrefixValid("b"));
        System.out.println(trie.isWordValid("car"));
        System.out.println(trie.isWordValid("dog"));
        
    }
}