package Day1;

public class Variable {
    public static String name1 = "xiaowang";
    public static String name2 ;
    public final static int age1 = 8 ;
    public static int age2 ;



    public static void main(String[] args) {
        String name3 = "lisi";
        name3 = "zhaoliu";
        System.out.println(Variable.name1);
        System.out.println(Variable.name2);
        System.out.println(Variable.age1);
        System.out.println(Variable.age2);
        System.out.println(name3);

    }

}
