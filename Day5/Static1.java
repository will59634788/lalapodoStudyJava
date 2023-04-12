package Day5;

public class Static1 {
    public static int a = 1;//静态变量或方法，可通过类名直接访问，所有实例共享数据

    static {
        System.out.println("类加载了，静态代码块只会执行一次");
    }
    public Static1(){
        a++;
    }
    public static int getA(){
        return a;
    }

    public static void main(String[] args) {
        Static1 static1 = new Static1();

        System.out.println(static1.getA());
        System.out.println(static1.a);
        System.out.println(getA());

        Static1 static2 = new Static1();
        System.out.println(static2.getA());
        Static1 static3 = new Static1();
        System.out.println(static3.getA());

    }
}
