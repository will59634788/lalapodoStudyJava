package Day2;

public class For {
    public static void main(String[] args) {
        int a = 2;
        for (int i = 0; i < 20; i++) {
            System.out.println(a);
            a++;
        }
        int b = 5;
        for (; ;) { //缺省无限打印
            System.out.println(b);
            b++;
        }


    }
}
