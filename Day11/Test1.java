package Day11;

public class Test1 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("Day11.User");
        System.out.println(c1);

        Class c2 = Class.forName("Day11.User");
        Class c3 = Class.forName("Day11.User");
        Class c4 = Class.forName("Day11.User");
        //一个类在内存中智游一个class对象！在内存中加载后，
        // 类的整个结构都被封装在class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
//        class Day11.User
//        932583850
//        932583850
//        932583850




    }
}
