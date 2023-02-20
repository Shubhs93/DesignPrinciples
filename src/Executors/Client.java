package Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        for(int i=0;i<=100;i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }
        executor.shutdown();
    }
}
