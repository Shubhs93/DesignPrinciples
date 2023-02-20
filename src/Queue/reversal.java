package Queue;

import java.util.Arrays;
import java.util.*;

public class reversal {
    public static void main(String[] args) {
        int[] A={2, 3, 1, 5, 4};
        int[] B={1, 3, 5, 4, 2};
        solve(A,B);
    }
    public static void solve(int[] A,int[] B) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<A.length;i++){
            q.add(A[i]);
        }
        int count=0;
        for(int i=0;i<B.length;i++){
            while(B[i]!=q.peek()){
                int el=q.poll();
                q.add(el);
                count+=1;
                System.out.println("i "+ i+" :"+q);
            }
            q.poll();
            count+=1;


        }
        System.out.println(count);
    }
}
