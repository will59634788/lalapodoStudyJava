package Day3;

public class OOP01 {
    public static void main(String[] args) {
        int a  = 1;
        OOP01 oop01 = new OOP01();
        oop01.say(a);
        System.out.println(a);
    }

    public void say(int a){
        a++;
        System.out.println(a);
    }
}
