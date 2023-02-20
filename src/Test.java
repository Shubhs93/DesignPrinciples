import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {
    static class HeapInfo{
        int curr_val;
        int idx;
        HeapInfo(int val,int i){
            this.curr_val=val;
            this.idx=i;
        }

        @Override
        public String toString() {
            return "{" + curr_val +", idx=" + idx +'}';
        }
    }


    public static void main(String[] args) {
       String s="new Java";
       String p=new String("new Java");
        System.out.println(s==p);

    }


}
