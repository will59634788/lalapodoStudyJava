package Day3;

public class OOP02 {
   String name;
   int age;
//有参无参快捷键 Alt+insert
    public OOP02() {
    }


    public OOP02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        OOP02 oop01 = new OOP02();

        System.out.println( oop01.toString());
    }
}
