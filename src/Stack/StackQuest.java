package Stack;

import java.util.*;

public class StackQuest {
    public static void main(String[] args) {
        int[] A={992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347 };
        //992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347
        solve(A);
    }
    public static int solve(int[] A) {
        int[] nsl=new int[A.length];//nearest smallest num on left
        int[] nsr=new int[A.length];
        int[] nll=new int[A.length];//nearest largest num on left
        int[] nlr=new int[A.length];
        Stack<Integer> snsl=new Stack<>();//stack for nearest smallest num on left
        Stack<Integer> snsr=new Stack<>();
        Stack<Integer> snll=new Stack<>();//stack for nearest largest num on left
        Stack<Integer> snlr=new Stack<>();
        int mod=1000*1000*1000+7;
        int l=A.length-1;
        for(int i=0;i<A.length;i++){
            while(snsl.size()>0&&A[snsl.peek()]>=A[i]){
                snsl.pop();
            }
            if(snsl.size()==0){
                nsl[i]=-1;
            }else{
                nsl[i]=snsl.peek();
            }
            snsl.push(i);

            while(snsr.size()>0&&A[snsr.peek()]>=A[l-i]){
                snsr.pop();
            }
            if(snsr.size()==0){
                nsr[l-i]=-1;
            }else{
                nsr[l-i]=snsr.peek();
            }
            snsr.push(l-i);

            while(snll.size()>0&&A[snll.peek()]<=A[i]){
                snll.pop();
            }
            if(snll.size()==0){
                nll[i]=-1;
            }else{
                nll[i]=snll.peek();
            }
            snll.push(i);

            while(snlr.size()>0&&A[snlr.peek()]<=A[l-i]){
                snlr.pop();
            }
            if(snlr.size()==0){
                nlr[l-i]=-1;
            }else{
                nlr[l-i]=snlr.peek();
            }
            snlr.push(l-i);
        }
        System.out.println(Arrays.toString(nsl));
        System.out.println(Arrays.toString(nsr));
        System.out.println(Arrays.toString(nll));
        System.out.println(Arrays.toString(nlr));
        long min=0;
        long max=0;
        for(int i=0;i<A.length;i++){
            if(nsl[i]==-1&&nsr[i]==-1){
               // min+=(1L*(i-nsl[i])%mod*(l+1-i)%mod*A[i]%mod)%mod;
                min+=(1l*(l+1))%mod*A[i]%mod;
                min=min%mod;
            }else if(nsl[i]==-1){
                min+=(1L*(i+1)%mod*(nsr[i]-i)%mod*A[i]%mod)%mod;
                min=min%mod;
            }else if(nsr[i]==-1){
                min+=(1L*(i-nsl[i])%mod*(l+1-i)%mod*A[i]%mod)%mod;
                min=min%mod;
            }else{
                min+=(1L*(i-nsl[i])%mod*(nsr[i]-1)%mod*A[i]%mod)%mod;
                min=min%mod;
            }
            if(nll[i]==-1&&nlr[i]==-1){
                max+=(1l*(l+1))%mod*A[i]%mod;
                max=max%mod;
            }else if(nll[i]==-1){
                max+=(1L*(i+1)%mod*(nlr[i]-i)%mod*A[i]%mod)%mod;
                max=max%mod;
            }else if(nlr[i]==-1){
                max+=(1L*(i-nll[i])%mod*(l+1-i)%mod*A[i]%mod)%mod;
                max=max%mod;
            }else{
                max+=(1L*(i-nll[i])%mod*(nlr[i]-i)%mod*A[i]%mod)%mod;
                max=max%mod;
            }
        }
        return (int)(max-min);
    }
    public static int check(char a){
        if(a=='^'){
            return 3;
        }
        if(a=='/'||a=='*'){
            return 2;
        }
        return 1;
    }
}
