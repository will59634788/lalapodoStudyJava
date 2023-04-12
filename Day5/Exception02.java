package Day5;

public class Exception02 {
    public static void main(String[] args) {

        try {
//            int math = Test.math(1, 0);
            int math = Test.math(1, 1);
            System.out.println(math);
        } catch (ArithmeticException e) {
            System.out.println("数学运算异常");
        }
    }
}

class Test {
    public static int math(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}


