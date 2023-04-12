package Day9;

public class Thread04 {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        MyThread thread1 = new MyThread(synchronizedExample);
        MyThread thread2 = new MyThread(synchronizedExample);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizedExample.getCount());
    }
}
