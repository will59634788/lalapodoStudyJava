package Day9;
//线程中断操作
public class Thread02 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{

            try {
                while (!Thread.currentThread().isInterrupted()){
                    //当前线程是否中断？取反为真时=》执行没有中断
                    System.out.println("线程正在执行。。。");
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                System.out.println("线程中断了。。。");
            }
        });

        Thread thread2 = new Thread(()->{

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           thread1.interrupt();  //在线程2中 请求线程1中断执行
        });

        thread1.start();
        thread2.start();



    }
}
