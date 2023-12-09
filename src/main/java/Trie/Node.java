package main.java.Trie;

public class Node {
    Node[] children;
    boolean eow;

    public Node() {
        this.children = new Node[26];
        for(int i=0; i<26; i++){
            children[i]= null;
        }
        this.eow = false;
    }
}
