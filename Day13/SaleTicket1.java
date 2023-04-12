package Day13;

//并发编程本质是充分利用CPU资源，多个线程同时执行，线程池
//线程的状态，六个
//NEW新生  RUNNABLE运行 BLOCKED阻塞 WAITING等待  TIMED_WAITING超时等待  TERMINATED终止
//wait／sleep区别
//    1、来自不同的类
//        wait =>Object
//        sleep => Thread
//    2、关于锁的释放
//        wait 会释放铁，sleep睡觉了。抱着锁睡觉，不会释放！
//    3、使用的范围是不同的
//        wait  必须在同步代码块中
//        sleep 可以再任何地万睡
//     4、是否需要捕获异常
//        wait 不需要插获异常
//        sleep 必须要插获异常
public class SaleTicket1 {
    public static void main(String[] args) {
        //并发，就是多线程操作同一个资源类，把资源丢进线程
        Ticket ticket = new Ticket();
        //lambda表达式  (参数)->{代码}
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        }, "a").start();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        }, "b").start();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        }, "c").start();
    }
}

class Ticket {
    private int number = 30;

    //    synchronized本质是队列，锁
    public synchronized void sale() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() +
                    "卖出了第 " + (number--) + "张票，剩余" + number);
        }
    }


}

//        a卖出了第 30张票，剩余29
//        a卖出了第 29张票，剩余28
//        a卖出了第 28张票，剩余27
//        a卖出了第 27张票，剩余26
//        a卖出了第 26张票，剩余25
//        a卖出了第 25张票，剩余24
//        a卖出了第 24张票，剩余23
//        a卖出了第 23张票，剩余22
//        a卖出了第 22张票，剩余21
//        a卖出了第 21张票，剩余20
//        a卖出了第 20张票，剩余19
//        a卖出了第 19张票，剩余18
//        a卖出了第 18张票，剩余17
//        a卖出了第 17张票，剩余16
//        a卖出了第 16张票，剩余15
//        a卖出了第 15张票，剩余14
//        a卖出了第 14张票，剩余13
//        a卖出了第 13张票，剩余12
//        a卖出了第 12张票，剩余11
//        a卖出了第 11张票，剩余10
//        a卖出了第 10张票，剩余9
//        a卖出了第 9张票，剩余8
//        a卖出了第 8张票，剩余7
//        a卖出了第 7张票，剩余6
//        a卖出了第 6张票，剩余5
//        a卖出了第 5张票，剩余4
//        a卖出了第 4张票，剩余3
//        a卖出了第 3张票，剩余2
//        a卖出了第 2张票，剩余1
//        a卖出了第 1张票，剩余0