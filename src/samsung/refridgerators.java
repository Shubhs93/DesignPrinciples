package samsung;
import java.io.*;
import java.util.*;
public class refridgerators {

    class GFG {
        static class pair{
            int x,y;
            public pair(int a,int b)
            {
                x=a;
                y=b;
            }
        }
        public static boolean check(boolean visited[ ]) {
            for(int i=1;i<visited.length;i++)
            {
                if(visited[i]==false)
                    return false;
            }
            return true;
        }
        public static int helper(ArrayList<pair> list,pair src,pair dest,int dist,boolean visited[]) {
            if((src.x==dest.x&&src.y==dest.y)&&check(visited))
            {
                return dist;
            }
            else if(src.x==dest.x&&src.y==dest.y)
            {
                return Integer.MAX_VALUE;
            }

            int min=Integer.MAX_VALUE;
            for(int i=1;i<visited.length;i++)
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    int a=Math.abs(src.x-list.get(i).x)+Math.abs(src.y-list.get(i).y);//dist from source to current index of list
                    int num=helper(list,list.get(i),dest,dist+a,visited);
                    visited[i]=false;
                    min=Math.min(num,min);
                }
            }
            return min;
        }

        public static void main (String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            n+=2;
            ArrayList<pair> list=new ArrayList<pair>();
            for(int i=0;i<n;i++)
            {
                int a=s.nextInt();
                int b=s.nextInt();
                pair p=new pair(a,b);
                list.add(p);
            }
            pair src=list.get(0);
            pair dest=list.get(1);
            boolean visited[]=new boolean[n];
            visited[0]=true;
            int ans=helper(list,src,dest,0,visited);
            System.out.println(ans);
        }
    }
}
