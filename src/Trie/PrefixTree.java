package Trie;

import java.util.HashMap;

public class PrefixTree {
    static class Node{
        int count;
        HashMap<Character, Node> hm=new HashMap<>();
        Node(){
            this.count=0;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "count=" + count +
                    ", hm=" + hm +
                    '}';
        }
    }
    static Node root=new Node();

    public static void main(String[] args) {
        String[] A={"s", "ss", "sss", "ssss"};
        String[] ans=new String[A.length];
        for(int i=0;i<A.length;i++){
            insert(A[i],root);
        }
        for(int i=0;i<A.length;i++){
            //ans[i]=search(A[i],root);
        }
       // System.out.println("ans "+ans[0]);
    }
    public static void insert(String str,Node root){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(root.hm.containsKey(ch)){
                root.count+=1;
                root=root.hm.get(ch);
            }else{
                Node tmp=new Node();
                root.hm.put(ch,tmp);
                root.count+=1;
                root=root.hm.get(ch);
            }
        }

    }
    public static String search(String str,Node root){
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            root=root.hm.get(ch);
            if(root.count==1){
                ans+=ch;
                return ans;
            }else{
                ans+=ch;
            }
        }
        return ans;
    }
}
