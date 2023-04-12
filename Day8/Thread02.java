package Day8;

import org.apache.poi.ss.formula.functions.T;

public class Thread02 extends Thread{
    private String name ;

    public Thread02(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new Thread02("线程1执行").start();
        new Thread02("线程2执行").start();
        new Thread02("线程3执行").start();
    }
}
