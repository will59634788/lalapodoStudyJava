package Day9;
//守护线程    Daemen Thread
public class Thread03 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (true){
                try {
                    System.out.println("守护线程正在执行。。。");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //守护线程是为其他线程服务的，主线程结束时守护线程会自动结束
        thread.setDaemon(true);
        thread.start();
        System.out.println("主线程在执行。。。");
        Thread.sleep(5000);
        System.out.println("主线程停止执行。。。");


//        主线程在执行。。。
//        守护线程正在执行。。。
//        守护线程正在执行。。。
//        守护线程正在执行。。。
//        守护线程正在执行。。。
//        守护线程正在执行。。。
//        主线程停止执行。。。
    }
}
