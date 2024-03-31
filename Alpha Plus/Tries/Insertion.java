package Tries;

public class Insertion {
    public static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {//O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int i = 0;i<key.length();i++){
            int idx = key.charAt(i) - 'a'; 
            if(curr.children[idx] == null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.isEndOfWord;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (String word : words) {
            insert(word);
        }
        System.out.println(search("t"));
    }
}
