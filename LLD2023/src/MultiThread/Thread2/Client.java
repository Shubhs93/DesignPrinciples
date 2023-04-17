package MultiThread.Thread2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,4,6,2,8,1,2,9,7,10));

        ExecutorService executorService= Executors.newCachedThreadPool();

        MergeSorter mergeSorter=new MergeSorter(arr);

        Future<ArrayList<Integer> > sortedListFuture=executorService.submit(mergeSorter);
        ArrayList<Integer> ans=sortedListFuture.get();
        System.out.println(ans);


    }
}
