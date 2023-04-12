package Day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person tom = new Person("tom", 18,"sss");
       final ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("person.txt"));
        Person person = (Person) objectInputStream.readObject();
        //        Tom反序列化
        System.out.println(tom);
        System.out.println(person);
    }
}
