//MY WAY OF CODE, MAM HAS DONE DIFFERENTLY IT IS IN NOTEBOOK
package Tries;

public class PrefixProblem {
    public static class Node{
        Node children[]=new Node[26];
        boolean eow;
        int freq;
        
        Node(){
            for(int i =0 ;i<26;i++){
                children[i]=null;
            }
            eow=false;
            freq=0;
        }

    }
    public static Node root = new Node();
    public static void insert(String word) {//O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                curr.freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
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
        return curr.eow;
    }
   public static String prefix(String word){
    Node curr=root;
    for(int i =0;i<word.length();i++){
        int idx = word.charAt(i)-'a';
        if(curr.freq==1){
            return word.substring(0, i);
        }
        curr=curr.children[idx];
    }
    return word;
   }
    public static void main(String[] args) {
        String words[] = {"zebra","dog","duck","dove"};
        String ans[]=new String[words.length];
        for (String word : words) {
            insert(word);
        }
        for(int i =0;i<ans.length;i++){
            ans[i]=prefix(words[i]);
        }
        // System.out.println(ans.toString());
        for (String w : ans) {
            System.out.println(w);
        }

        String s="Helo";
        System.out.println(s.substring(0, 0));
    }
}
