package Day9;

import com.sun.org.apache.bcel.internal.generic.NEW;

//线程的状态
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("当前线程状态是："+thread.getState());
        thread.start();
        System.out.println("当前线程状态是："+thread.getState());
        Thread.sleep(1000);
        System.out.println("当前线程状态是："+thread.getState());
        Thread.sleep(2000);

        System.out.println("当前线程状态是："+thread.getState());

          //        当前线程状态是：NEW           线程刚创建未启动
          //        当前线程状态是：RUNNABLE      线程在执行或等待中
          //        当前线程状态是：TIMED_WAITING  限时等待中
          //        当前线程状态是：TERMINATED      线程执行结束

    }
}
