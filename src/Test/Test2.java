package Test;

import java.util.*;

public class Test2 {
    public static class pqInfo{
        int sum;
        int a;
        int b;
        pqInfo(int sum,int a,int b){
            this.sum=sum;
            this.a=a;
            this.b=b;
        }
    }
    public static class setInfo{
        int i;
        int j;
        setInfo(int i,int j){
            this.i=i;
            this.j=j;
        }
    }

    static PriorityQueue<Integer> maxH = new PriorityQueue<Integer>                                                            (Collections.reverseOrder());

    static PriorityQueue<Integer> minH = new PriorityQueue<Integer>();
    public static class knightInfo{
        int i;
        int j;
        int t;
        knightInfo(int i,int j,int t){
            this.i=i;
            this.j=j;
            this.t=t;

        }

        @Override
        public String toString() {
            return "{" +
                    "(" + i +
                    "," + j +")"+
                    ", " + t +
                    '}';
        }
    }
    public static class PqInfo{
        int root_val;
        int level;
        PqInfo(int root_val,int level){
            this.root_val=root_val;
            this.level=level;
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("p1");
        arr.add("p14");
        arr.add("p6");
        arr.add("p2");
        arr.add("p10");
        System.out.println();

        Collections.sort(arr,new Comparator<String>(){
            public int compare(String a,String b ){
                int x=Integer.parseInt(a.substring(1));
                int y=Integer.parseInt(b.substring(1));
                return x-y;
            }
        });
        System.out.println(arr);
    }


    public static int recfun(int []A,int i,int tmp){
        if(i<0){
            return 0;
        }

        if(tmp>A[i]){
            return Math.max(recfun(A,i-1,A[i])+A[i],recfun(A,i-1,tmp));
        }else{
            return recfun(A,i-1,tmp);
        }
    }
    public static int recMemo(String A,String B,int[][] dp,int i,int j){
        System.out.println(i+" "+j);
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        System.out.println(i+" "+j);
        if(i!=j && A.charAt(i)==B.charAt(j) ){
            dp[i][j]= 1+recMemo(A,B,dp,i-1,j-1);
        }else{
            dp[i][j]= Math.max(recMemo(A,B,dp,i-1,j),recMemo(A,B,dp,i,j-1));
        }
        return dp[i][j];
    }
    public static int recFun(String A,String B,String C,int i,int j,int k){
        if(i<0||j<0||k<0){
            return 0;
        }
        if(A.charAt(i)==B.charAt(j) && B.charAt(j)==C.charAt(k)){
            return 1+recFun(A,B,C,i-1,j-1,k-1);
        }else{
            return Math.max(recFun(A,B,C,i-1,j,k),Math.max(recFun(A,B,C,i,j-1,k),recFun(A,B,C,i,j,k-1)));
        }

    }
    public static void remove(String A,int min,HashSet<String> hs,ArrayList<String> res){

        if(min==0){
            System.out.println(min);
            int b=minRemoval(A);
            if(b==0){
                if(!hs.contains(A)){
                    hs.add(A);
                    res.add(A);
                }
            }
            return;
        }
        for(int i=0;i<A.length();i++){

            if(A.charAt(i)!='(' && A.charAt(i)!=')') continue;
            String x=A.substring(0,i);
            String y=A.substring(i+1);
            String a=x+y;
            if(!hs.contains(a)){
                remove(a,min-1,hs,res);
            }
        }
        return;
    }
    public static int removeBracket(String s){
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);

            if(x=='(') stack.push(x);
            else if(x==')'){
                if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
                else stack.push(x);
            }
        }
        return stack.size();
    }
    public static int minRemoval(String A){
        Stack<Character> st=new Stack();
        int c=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('){
                st.push('(');
            }else if(A.charAt(i)==')'){
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(')');
                }
            }
        }
        return st.size();
    }
    public static int dfs(ArrayList<Integer> g[],int[]B,int src,boolean arr[]){
        if(arr[src]){
            return 0;
        }
        arr[src]=true;
        int ans=B[src-1];
        //System.out.println("node "+src+" "+B[src-1]+" "+ans);

        for(int i=0;i<g[src].size();i++){
            int node=g[src].get(i);
                ans+=dfs(g,B,node,arr);
        }
        //System.out.println(ans);
        return ans;
    }

    public static void kp(int[][]dp,int [] B,int C[],int k){
        for(int i=1;i<=B.length;i++){
            for(int j=1;j<=k;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=B[i-1]){
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-B[i-1]]+C[i-1]);
                }
            }
        }
    }
    public static void addNum(int num) {
        int count=1;
        if(count==1){
            maxH.add(num);
            return ;
        }
        if(num>maxH.peek()){
            minH.add(num);
        }else{
            maxH.add(num);
        }

        if(minH.size()>maxH.size()){
            maxH.add(minH.poll());
        }else if((maxH.size()-minH.size())>1){
            int ele=maxH.poll();
            System.out.println(" el "+ele);
            minH.add(ele);
            System.out.println(" val "+maxH.peek());

        }
        System.out.println(maxH);
        System.out.println(minH);
    }
}
