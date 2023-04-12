package Day11;
//测试class类的创建方式有哪些
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是："+person.name);
        //1.通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());
        //2.forname方式获得
        Class c2 = Class.forName("Day11.Person");
        System.out.println(c2.hashCode());
        //3.通过类名.class方式获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());
        //4.基本内置类的包装类都有一个type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);
        //5.获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);


    }
            //    这个人是：学生
            //        932583850
            //        212628335
            //        932583850
            //    int
            //    class Day11.Person

}


class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{

    public Student() {
        this.name="学生";
    }
}
class Teacher extends Person{

    public Teacher() {
        this.name="老师";
    }
}