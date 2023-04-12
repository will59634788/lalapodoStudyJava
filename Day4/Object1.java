package Day4;

//方法重载
public class Object1 {
    public static void main(String[] args) {
        Object1 object1 = new Object1();
        object1.eat1();
        object1.eat2("鸡排");
        object1.eat3("汉堡", 2);

//        Object2 object2 = new Object2();
//        object2.setAge(18);
//        object2.setUsername("xiaowang");
//        object2.setPassword("1223456");
//        System.out.println(object2);


        Object3 object3 = new Object3("aaa", "jacky", 22, "888");
        System.out.println(object3.getSchool());
        System.out.println(object3.getUsername());
        System.out.println(object3.getPassword());
        System.out.println(object3.getAge());
        //aaa  jacky  888  22

        Dog dog = new Dog();
        dog.cry();
    }

    public void eat1() {
        System.out.println("eat...");
    }

    public void eat2(String foodName) {
        System.out.println("eat..." + foodName);
    }

    public void eat3(String foodName, int num) {
        System.out.println("eat..." + foodName + num);
    }
}
