package Day10;
//泛型
public class Test2 {
    public static <T> void printArray(T[] arr){
        for (T e: arr) {
            System.out.println(e+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyClass<Object> class1 = new MyClass<>();
        class1.setData("bbb");
        System.out.println(class1.getData());

        printArray(new String[] {"aa","bb","cc"});
    }
}
