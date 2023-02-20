package Thread;

public class main {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
