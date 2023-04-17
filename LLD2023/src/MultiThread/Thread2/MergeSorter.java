package MultiThread.Thread2;

import java.util.ArrayList;
import java.util.concurrent.Callable;

 public class MergeSorter implements Callable<ArrayList<Integer>> {
    private  ArrayList<Integer> arr;
    MergeSorter(ArrayList<Integer> array){
        this.arr=array;
    }
    
    public ArrayList<Integer> call() throws Exception{
        if(arr.size() <=1){
            return arr;
        }
        int m=arr.size()/2;
        ArrayList<Integer> larr=new ArrayList<>();
        ArrayList<Integer> rarr=new ArrayList<>();

        for(int i=0;i<m;i++){
            larr.add(arr.get(i));
        }
        for(int i=m;i<arr.size();i++){
            rarr.add(arr.get(i));
        }

        MergeSorter leftMergeSorter=new MergeSorter(larr);
        MergeSorter rightMergeSorter=new MergeSorter(rarr);

        ArrayList<Integer>leftMergeArr=leftMergeSorter.call();
        ArrayList<Integer>rightMergeArr=rightMergeSorter.call();

        ArrayList<Integer> sortedList=new ArrayList<>();
        int s=leftMergeArr.size();
        int e=rightMergeArr.size();

        int i=0;
        int j=0;
        while(i<s&& j<e){
            if(leftMergeArr.get(i)>rightMergeArr.get(j)){
                sortedList.add(rightMergeArr.get(j));
                j+=1;
            }else{
                sortedList.add(leftMergeArr.get(i));
                i+=1;
            }

        }
        while(i<s){
            sortedList.add(leftMergeArr.get(j));
            i+=1;
        }
        while(j<e){
            sortedList.add(rightMergeArr.get(j));
            j+=1;
        }

        return  sortedList;

    }
}
