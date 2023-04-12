package Day9;

//线程中的 wait()方法使当前线程进入等待，必须在synchronized块内部调用
//notify() 方法 通知线程结束等待，继续执行

public class Thread05 {
    public static void main(String[] args) {
        Object o = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (o) {
                System.out.println("线程1开始等待了。。。");
                try {
                    o.wait();   //必须在synchronized块内部调用
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("线程1继续执行。。。");
                }
            }

        });

        Thread thread2 = new Thread(() -> {
           synchronized (o){
               System.out.println("线程2发送通知给线程1");
               o.notify();
           }
        });

        thread1.start();
        thread2.start();
//        线程1开始等待了。。。
//        线程2发送通知给线程1
//        线程1继续执行。。。
    }
}
