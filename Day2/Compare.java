package Day2;

public class Compare {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(a>>>2);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a&b);
        System.out.println(a<<2);
        System.out.println(Integer.toBinaryString(a));//������a��ֵ
        System.out.println(Integer.toBinaryString(b));//������b��ֵ

        String c = a==b? "true":"false";
        System.out.println(c);

        boolean b1 = c instanceof String;
        System.out.println(b1);


    }
}
