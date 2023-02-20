package Stack;

import java.util.Stack;

public class removeDupli {
    public static void main(String[] args) {
        String A="abcd";
        int k=2;
        removeDuplicates(A,k);
    }
    public static String removeDuplicates(String s, int k) {
        StringBuilder str=new StringBuilder();
        Stack<Character> ch=new Stack<>();
        Stack<Integer> cnt=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(ch.size()==0){
                ch.push(s.charAt(i));
                cnt.push(1);
            }else{
                if(ch.peek()==s.charAt(i)){
                    int prev_cnt=cnt.peek();
                    cnt.pop();
                    cnt.push(prev_cnt+1);
                }else{
                    ch.push(s.charAt(i));
                    cnt.push(1);
                }
                if(cnt.peek()==k){
                    cnt.pop();
                    ch.pop();
                }
            }
        }
        System.out.println(ch);
        System.out.println(cnt);
        int l=ch.size();
        for (int i=0;i<l;i++){
            for(int j=0;j<cnt.peek();j++){
                str.append(ch.peek());
            }
            ch.pop();
            cnt.pop();
        }
        System.out.println(str.reverse());
        return str.reverse().toString();
    }
}
