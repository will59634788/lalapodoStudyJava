package Day10;
//反射
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("我的名字是："+name+"年龄"+age);
    }
    public static void hello(){
        System.out.println("我是person");
    }
}
