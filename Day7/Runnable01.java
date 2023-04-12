package Day7;

public class Runnable01 {
    public static void main(String[] args) {
        Runnable task = new Runnable(){
            @Override
            public void run() {
                System.out.println("task run");
            }

        };
        new Thread(task).start();
    }
}
class Runnable02{
    public static void main(String[] args) {//上述的简化写法
        new Thread(()-> System.out.println("task run2...")).start();
    }
}
