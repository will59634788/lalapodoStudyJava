package Day8;
//实现Runnable接口 不影响类的其他继承关系，否则继承Thread就只能单继承了
//注意，其run方法无法返回值或抛异常
public class Thread03 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程1。。。");
            }
            }).start();



         //lambda 简化写法  同上一样的效果
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("线程2。。。");
            }
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("线程3。。。");
            }
        }).start();
    }

}
