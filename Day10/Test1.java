package Day10;
//泛型
public class Test1 {
    public static void main(String[] args) {
        MyClass<Object> class1 = new MyClass<>();
        class1.setData("aaa");
        System.out.println(class1.getData());
    }
}
