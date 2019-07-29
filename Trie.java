package com.codingdojo.tries;

public class Trie {
    public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }

    boolean isPrefixValid(String prefix){
        Node current = root;
        for (int i = 0; i < prefix.length(); i++) {
            Character c = prefix.charAt(i);
            Node next = current.children.get(c);
            if (next == null) {
                return false;
            }
            current = next;
        }
        return true;
    }

    boolean isWordValid(String word){
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            Node next = current.children.get(c);
            if (next == null) {
                return false;
            }
            current = next;
        }
        return current.isCompleteWord;
    }

    public void printAllKeys() {
    	recursivePrinting(this.root);
    }

	private void recursivePrinting(Node current) {
    	for (Character key : current.children.keySet()) {  
            System.out.println("key: " + key);
            Node child = current.children.get(key);
            if(child == null) {
               	return;
            }
            recursivePrinting(child);
    	}
	}
}
