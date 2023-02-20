package MultiThread;

public class check {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            MultiThread t1=new MultiThread();
            Thread t=new Thread(t1);
            t.start();
        }

    }
}
