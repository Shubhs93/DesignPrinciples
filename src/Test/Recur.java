package Test;

public class Recur {
    public static void main(String[] args) {
    int a[]={7,4,1,2,2};
    int k=11;
     int n=a.length;
        int dp[][]=new int[n+1][k+1];


        System.out.println(memoFun(a,k));

    }
    public static int recFun(int[]a,int[][]dp,int k,int n){
        if(n==0){
            if(a[0]==k){
                dp[n][k]= 1;
            }else{
                dp[n][k]= 0;
            }
        }
        if(k==0){
            dp[n][k]=0;
        }
        if(dp[n][k]!=Integer.MAX_VALUE) return dp[n][k];

        if((k>=a[n])) {
            dp[n][k]=Math.min( 1+recFun(a,dp,k-a[n],n-1), recFun(a,dp,k,n-1));
        }else{
            dp[n][k]=recFun(a,dp,k,n-1);
        }
        return dp[n][k];
    }

    public static int memoFun(int[]a,int k){
        int n=a.length;
        int dp[][]=new int[n+1][k+1];
        for(int i=0;i<=k;i++){
            //for(int j=0;j<=k;j++){
                dp[0][i]=Integer.MAX_VALUE-5;
            //}
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=k;j++){
              dp[i][j]=0;
            }
        }
        dp[0][0]=0;
        if(k>=a[0]){
            dp[0][a[0]]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=k;j++){
                if((j>=a[i-1])) {
                    dp[i][j]=Math.min( 1+dp[i-1][j-a[i-1]], dp[i-1][j]);
                    if(i==2 && j==5){
                        System.out.println(" "+(i-1)+" "+(j-a[i-1])+" "+(1+dp[i-1][j-a[i-1]]));
                    }
                }else{
                    dp[i][j]=dp[i-1][j];
                    if(i==1 && j==1){
                      //  System.out.println(" "+(i-1)+" "+(j-a[i-1])+" "+(1+dp[i-1][j-a[i-1]]));
                    }
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=k;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][k];
    }


}
