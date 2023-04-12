package Day5;
//JAVA多态
public class Person {


    public String name;

    void eat(){
        System.out.println("eat  food");
    }
}

class Chinese extends Person{
    @Override
    void eat(){
        System.out.println("eat rice");
    }

}
class America extends Person{
    @Override
    void eat(){
        System.out.println("eat hamburger");
    }

}
class  Main{
    public static void main(String[] args) {
        America america = new America();
        Chinese chinese = new Chinese();
        Person person = new Person();
        america.eat();
        chinese.eat();
        person.eat();
//        eat hamburger
//        eat rice
//        eat  food
    }
}

