package BinarySearch;
import  java.util.*;
public class Median {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(-24, -11, -7, 4, 21, 26));
        ArrayList<Integer> b= new ArrayList<>(Arrays.asList(25, 44 ));

        int n=a.size();
        int m=b.size();
        int median=(n+m)/2;
        if((m+n)%2==0){
            //return (((double)findMedianSortedArray(a,n,b,m,median)+findMedianSortedArray(a,n,b,m,median-1))/2;
        }
        //return (double)findMedianSortedArray(a,n,b,m,median);

    }

    public static double findMedianSortedArray(final List<Integer> a ,int n, final List<Integer>  b,int m,int median) {
        int l=0;
        int r=0;
        if(n==0&&m==0){
            return 0;
        }
        if(n==0){
            if(m%2==0){
                return ((double)b.get(m/2)+b.get(m/2-1))/2;
            }
            return b.get(m/2);
        }else if(m==0){
            if(n%2==0){
                return ((double)a.get(n/2)+a.get(n/2-1))/2;
            }
            return a.get(n/2);
        }else{
            r=Math.max(a.get(n-1),b.get(m-1));
            l=Math.min(a.get(0),b.get(0));
        }
        int ans=0;
        int midean=(n+m)/2;
        System.out.println("mid "+midean);
        while(l<=r){
            int mid=(l+r)/2;
            int count=check(a,mid);
            count+=check(b,mid);
            System.out.println("mid "+mid);
            System.out.println("count  "+count);
            if(count>midean){
                r=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        System.out.println("h"+ ans);
        return (double) ans;
    }
    public static int check(List<Integer> a,int m){
        int count=0;
        int l=0;
        int r=a.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a.get(mid)<m){
                count=mid+1;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return count;
    }

}
