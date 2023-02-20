package Trie;

import java.util.HashMap;

public class Trie {
    static class Node{
        boolean isEnd;
        HashMap<Character,Node> hm=new HashMap<>();
        Node(){
            this.isEnd=false;
        }

        @Override
        public String toString() {
            return "isEnd=" + isEnd +
                    ", hm=" + hm;
        }
    }
    static Node root =new Node();
    public static void main(String[] args) {
        String[] A={"a","b"};
        for(int i=0;i<A.length;i++){
            insert(A[i]);
        }
        System.out.println(root);
    }

    public static void insert(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(root.hm.containsKey(ch)){
                root=root.hm.get(ch);
            }else{
                Node tmp=new Node();
                root.hm.put(ch,tmp);
                root=root.hm.get(ch);
                System.out.println(root.hm+" "+ch);
            }
        }
        root.isEnd=true;
    }
    public static boolean search(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(root.hm.containsKey(ch)){
                root=root.hm.get(ch);
            }else{
                return false;
            }
        }
        return root.isEnd;
    }
}
