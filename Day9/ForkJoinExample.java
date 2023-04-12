package Day9;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

//ForkJoin并行计算的线程池框架，利用多核CPU把大任务拆分成小任务并行计算，最终合并结果
//RecursiveTask有返回结果的计算任务，RecursiveAction没有返回结果的计算任务
public class ForkJoinExample extends RecursiveTask<Long> {
    private static final int THRESHOLD = 10000;
    private final int[] array;
    private final int start;
    private final int end;


    public ForkJoinExample(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        ForkJoinExample task = new ForkJoinExample(array, 0, array.length);
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();//静态方法返回线程池实例对象
        System.out.println(forkJoinPool.getParallelism()); //cpu-1
        Long result = forkJoinPool.invoke(task);//交给线程计算
        ForkJoinPool forkJoinPool1 = new ForkJoinPool();
        System.out.println(forkJoinPool1.getParallelism()); //cpu
        Long result1 = forkJoinPool.invoke(task);
        System.out.println("结果是：" + result);
        //        7
        //        8
        //        结果是：50005000

    }


    @Override
    protected Long compute() {  //compute()方法用于执行实际运算
        if (end - start <= THRESHOLD) { //THRESHOLD表示阈值
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            ForkJoinExample left = new ForkJoinExample(array, start, mid);
            ForkJoinExample right = new ForkJoinExample(array, mid, end);
            left.fork();//开启新线程或复用线程
            right.fork();
            return left.join() + right.join();//等待线程处理完后返回结果，有阻塞效果
        }
    }
}
