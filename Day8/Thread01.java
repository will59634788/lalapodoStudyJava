package Day8;

import org.apache.tomcat.jni.Thread;

public class Thread01 extends Thread {

    public Thread01() {

    }

    public void run() {
        System.out.println("线程被执行了。。。。。。。");

    }

    public static void main(String[] args) {
        new Thread01().run();
    }
}
