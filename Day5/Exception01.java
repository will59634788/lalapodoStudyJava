package Day5;

public class Exception01 {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.substring(1));
        } catch (NullPointerException e) {  //子类异常
            System.out.println("空指针异常");
        } catch (RuntimeException e){ //父类异常
            System.out.println("异常");

        } finally {
            System.out.println("aaaaaaa");
        }
    }
}


