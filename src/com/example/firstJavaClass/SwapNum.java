package com.example.firstJavaClass;

public class SwapNum {
    int a=6;
    int b=9;
    static String col="dh";
    static void dis(){
        System.out.println("coll :"+ col);
    }

    public static class slope{
        int x;
        int y;
        slope(int x,int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public String toString() {
            return "slope{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public int hashCode() {
            final int p=31;
            int res=1;
            return p*res +x+y;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null){
                return  false;
            }
            if(obj==this){
                return true;
            }
            if(obj.getClass()!=this.getClass()){
                return false;
            }
            slope s=(slope) obj;
            if(s.x==this.x&&s.y==this.y){
                return true;
            }else{
                return false;
            }
        }
    }
}
