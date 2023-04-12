package Day6;

public class Test01 {
    public static  void main(String[] args) {
        MyInterface myInterface = (int a,int b)->{
            return a+b;
        };
        int calculate = myInterface.calculate(4, 6);
        System.out.println(calculate);
    }
}
