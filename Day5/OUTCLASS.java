package Day5;
//静态内部类可直接调用外部类的属性，方法
public class OUTCLASS {
    private static String name = "xiaowang";
    private static int age = 20;
    static class INNERCLASS{
        String name;
        public int getAge(){
            return OUTCLASS.age;

        }
        public String getName(){
            return  OUTCLASS.name;
        }
    }

    public static void main(String[] args) {
        INNERCLASS innerclass = new INNERCLASS();
        System.out.println(innerclass.getName());
        System.out.println(innerclass.getAge());

    }
}
