package Day2;

public class Switch01 {
    public static void main(String[] args) {
        String age = "10000";
//        String sex = "ÄÐ";
        switch (age){
            case "1":
                System.out.println(1);
                break;
            case "10":
                System.out.println(10);
                break;
            case "100":
                System.out.println(100);
                break;
            default:
                System.out.println(0);
        }
    }
}
