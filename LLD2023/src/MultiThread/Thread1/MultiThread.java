package MultiThread.Thread1;

public class MultiThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
