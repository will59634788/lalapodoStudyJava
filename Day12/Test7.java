package Day12;

import java.io.*;

// 对象流
// Java对象流是一种I／O流，可以用于读取和写入Java对象。
// ·这些对象可以是任何Java类的实例，只要这些类实现了java.io.Serializable接口。
// 序列化和反序列化
// ·序列化是将Java对象转换为字节序列的过程，这些字节序列可以在文件或网络连接中进行传输。
// ·反序列化是将字节序，并换回Java对象的过程。
// ·ObjectOutputStream和ObjectInputStream可以用于将Java对象序列化为字节流
// 并将其写入文件或网络连接，也可以将字节流反序列化为Java对象。
// ·它们提供了一种方便的方式来持久化Java对象
// Serializable接口
// ·要使用对象流，Java类必须实现java.io.Serializable接口。
// ·Serializable接口是一个标记接口，它没有任何方法或字段，仅用于表示类可以被序列化。
// ·在实现Serializable接口时，需要注意以下几点：
// 所有字段都必须是可序列化的。如果一个字段是一个对象，
// 那么该对象的类也必须实现Serializable接口。transient关键字可以用于标记不希望序列化的字段。
// 如果一个类的父类没有实现Serializable接口，则需要确保父类的无参构造函数可以被调用。
public class Test7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person tom = new Person("tom", 18,"password");
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("person.txt"));
        objectOutputStream.writeObject(tom);

        //把对象Tom序列化后person.txt文本里得到：
        //  sr Day12.Person鮬?嵛鏔 I ageL
        // namet Ljava/lang/String;xp   t tom
        objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("person.txt"));
        Person person = (Person) objectInputStream.readObject();
        //        Tom反序列化
        System.out.println(tom);
        System.out.println(person);

        //        Person{name='tom', age=18}
        //        Person{name='tom', age=18}

    }
}
