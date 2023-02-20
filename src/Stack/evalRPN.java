package Stack;

import java.util.Arrays;
import java.util.Stack;

public class evalRPN {
    public static void main(String[] args) {
        String[] A ={"2", "2", "/" };
       // int a=Integer.parseInt(A[0]);
        //System.out.println(a);
        System.out.println(evalRPNO(A));
    }
    public static int evalRPNO(String[] A) {
        Stack<Integer> s=new Stack<>();
        for(int i =0;i<A.length;i++){
            if(A[i]=="+"||A[i]=="-"||A[i]=="/"||A[i]=="*"){
                int b=Integer.valueOf(s.peek());
                s.pop();
                int a=Integer.valueOf(s.peek());
                s.pop();
                int ans=0;
                if(A[i]=="+"){
                    ans=a+b;
                }else if(A[i]=="-"){
                    ans=a-b;
                }else if(A[i]=="*"){
                    ans=a*b;
                }else if(A[i]=="/"){
                    ans=a/b;
                }

                s.push(ans);
            }else{
                s.push(Integer.valueOf(A[i]));
            }
        }
        return s.peek();
    }
}
