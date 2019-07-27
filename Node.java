import java.util.HashMap;

class Node {
    HashMap<Character, Node> children;
    boolean isCompleteWord;

    Node() {
        this.children = new HashMap<>();
        this.isCompleteWord = false;
    }
}
