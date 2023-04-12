package Day9;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedExample2 {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    //同一时间只能有一个线程访问这些方法
    public void increment() {
        lock.lock();
        try {
            count++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            count--;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        lock.lock();
        try {
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return 0;
    }
}
