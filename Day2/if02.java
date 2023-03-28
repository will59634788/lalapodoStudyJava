package Day2;

public class if02 {
    public static void main(String[] args) {
        int age = 18;
        String sex = "ÄÐ";
        if(age > 10){
            if(sex.equals("Å®")){
                System.out.println("boy1");
            }else{
                System.out.println("is not boy1");
            }
        }else if(age == 18){
            System.out.println("boy2");
        }else {
            System.out.println("boy3");
        }
    }
}
