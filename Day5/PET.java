package Day5;
//接口，补充单继承
public interface PET {
    String name= "tom";
    int age = 10;
    void eat();
    default void cry(){//默认方法，实现类可直接继承或重写
        System.out.println("crying...");
    }
    static void sleep(){//静态方法，接口名直接调用即可
        System.out.println("sleeping...");
    }
}
