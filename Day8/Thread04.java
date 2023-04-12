package Day8;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


//Callable接口 call方法课返回一个值且能抛出异常
public class Thread04 {
    public static void main(String[] args) throws Exception {
        int n = 45;
        Callable<Integer> callable = () -> rabbit(n);
        FutureTask<Integer> integerFutureTask = new FutureTask<>(callable);
        new Thread(integerFutureTask).start();
        Integer integer = integerFutureTask.get();
        System.out.println("计算结果是：" + integer);

    }

    static int rabbit(int n) {//兔子递归
        if (n == 1 || n == 2) return 1;
        return rabbit(n - 1) + rabbit(n - 2);
    }
}
