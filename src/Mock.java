import java.util.Arrays;

public class Mock {
    public static void main(String[] args) {
       int[]A={0,0,1,1,2,9,18,20,20,3,4,4,4,};
     int n=A.length;
        Arrays.sort(A);
        int a=0;
        int b=1;
        while(b<n){
            if(A[a]==A[b]){//duplicates
                b+=1;
            } else {
                a+=1;
                int tmp=A[a];
                A[a]=A[b];
                A[b]=tmp;
                b+=1;
            }
        }
        for(int i=a+1;i<n;i++){
            A[i]=-1;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(a);
     //int ans[]={0,1,2,3,4,9,18,20,-1,-1,-1,-1,-1,-1};
        //Arrays.sort(A);

     //sort
        //[0,0,1,1,2,3,4,4,4,4,9,18,20,20]-->nlogn
        //set=>{0,1,2,3,4,9,18,20}-->sc:o(n){worst case}
        // bestcase=o(1)//all same element
        //1.sort the array-->nlogn
        //2.insert in TreeSet-->Tc:o(nlong),sc->o(n)
        //3.traverse and will make changes in A[]-->o(n)


        //2.
              //1.sort the array-->nlogn
        /*
        * 0,0,1,1,2,9,18,20,20,3,4,4,4,,9,18,20,20
        *          a     b
        * 0,1,2,9,18,2,1,20,20,3,4,4,4,,9,18,20,20
        *
        *   a     b
        * 0 1 1 1 1
        *
        * */

    }
}
