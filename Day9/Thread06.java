package Day9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Executors框架           创建线程池，避免频繁创建销毁线程，提升性能
//newFixedThreadPool(?)   最多同时执行？个线程
//newCachedThreadPool()   动态线程池，根据任务数动态调整线程数

public class Thread06 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; i++) {
            executorService.execute(new Task(i) {
            });
        }
    }
}

class Task implements Runnable{
    private final int  id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("任务开始执行。。。"+id);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("任务结束了。。"+id);
        }
    }
}
