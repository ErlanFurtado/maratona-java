package furtado.erlan.maratonajava.javacore.ZZFthreads.test;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable2("ka"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("Me"));
        t1.start();
        t2.start();

    }
}