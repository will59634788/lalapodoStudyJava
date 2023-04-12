package Day9;

import polyglot.ast.Synchronized;

public class MyThread extends Thread{
  public SynchronizedExample synchronizedExample;


  public MyThread(SynchronizedExample synchronizedExample) {
    this.synchronizedExample= synchronizedExample;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      synchronizedExample.increment();
      synchronizedExample.decrement();
    }
  }
}
