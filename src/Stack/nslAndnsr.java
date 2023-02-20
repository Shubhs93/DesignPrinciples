package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nslAndnsr {
    public static void main(String[] args) {
        int A[]={992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347};
        int[] nsl=new int[A.length];//nearest smallest num on left
        int[] nsr=new int[A.length];
        int[] nll=new int[A.length];//nearest largest num on left
        int[] nlr=new int[A.length];
        Stack<Integer> snsl=new Stack<>();//stack for nearest smallest num on left
        Stack<Integer> snsr=new Stack<>();
        Stack<Integer> snll=new Stack<>();//stack for nearest largest num on left
        Stack<Integer> snlr=new Stack<>();
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
        long min=0;
        long max=0;
        System.out.println(Arrays.toString(nsl));
        System.out.println(Arrays.toString(nsr));
        System.out.println(Arrays.toString(nll));
        System.out.println(Arrays.toString(nlr));
        for(int i=0;i<A.length;i++){
            if(nsl[i]==-1&&nsr[i]==-1){
                min+=(i-nsl[i])*(l+1-i)*A[i];
            }else if(nsl[i]==-1){
                min+=(i+1)*(nsr[i]-i)*A[i];
            }else if(nsr[i]==-1){
                min+=(i-nsl[i])*(l+1-i)*A[i];
            }else{
                min+=(i-nsl[i])*(nsr[i]-1)*A[i];
            }
            if(nll[i]==-1&&nlr[i]==-1){
                max+=(i-nll[i])*(l+1-i)*A[i];;
            }else if(nll[i]==-1){
                max+=(i+1)*(nlr[i]-i)*A[i];
            }else if(nlr[i]==-1){
                max+=(i-nll[i])*(l+1-i)*A[i];
            }else{
                max+=(i-nll[i])*(nlr[i]-i)*A[i];
            }

            System.out.println(max);

        }
    }
}
