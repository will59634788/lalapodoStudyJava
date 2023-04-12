package Day12;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
// ·序列化是将Java对象转换为字节序列的过程，这些字节序列可以在文件或网络连接中进行传输。
// ·反序列化是将字节序，并换回Java对象的过程

public class Person implements Serializable {

//    当我们在使用java编程的时候，肯定会使用到serialversionuid，
//    但很多情况下并不知道serialversionuid的作用是什么，其实它就是一种语言序列化的机制。
//    serialversionuid的作用：答：serialversionuid的作用是验证版本一致性。
//    如果serialversionuid一致，说明他们的版本是一样的。反之，就说明版本不同，
//    就无法运行或使用相关功能。
// 1、serialversionuid是java中的一种序列化机制。2、当我们进行序列化操作时，
//    会把当前的版本写入到文件之中。
// 3、在运行的时候，它就会监测当前版本的serialversionuid与编写版本是否一致。
// 4、一般来说，默认的serialversionuid是“1L”，在没有手动修改的情况下就是这个。
// 5、还有一些时候会通过接口名、成员数等属性生成，那就是“serialVersionUID = xxxxL”
// 6、如果我们发现运行错误，一般会出现“warning”的代码，这时候将他改为“ignore”即可解决。
//
    private static final long serialVersionUID = 1111L;
    private String name;
    private int age;
    private  transient String password;
    //transient 避免敏感字段序列化  =>  password='null'


    public Person() {
    }

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }



// 自定义序列化和反序列化
// 有时候，Java对象可能包含不支持序列化的属性或字段，或者我们希望控制序列化和反序列化过程。
// 在这种情况下，我们可以自定义序划化和反序列化过程。
// 自定义序列化的类需要继承Serializable接口，并添加相应的方法。
// 如：writeObject方法、readObject方法、readObjectNoData方法等。
// Serializable接口中没有任何成员，这些方法都是可选的并不强制要求，但一般需要定义前2个方法。
// 这里Person类中我们将 password 字段定义为 private transient String password，
// 表示该字段不参与序列化过程。
// 但在自定义的writeObject和readObject方法中，
// 我们仍然手动将password 属性写入和读取对象流中。
// 在writeObject方法将password属性转换为大写，并写入对象流中。
// 在readObject方法从对象流中读取password属性，并将其转换为小写。
    private void writeObject(java.io.ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeObject(password.toUpperCase());
    }
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        password=((String) in.readObject()).toLowerCase();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
