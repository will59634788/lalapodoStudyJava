# markdown学习



# 标题



#空格+标题名字  =》加粗一级标题

##空格+名字 =》二级标题

###空格+名字 =》三级标题

####空格+名字 =》四级标题        最多支持六级标题

### 

# 字体



**加粗字体**     **  xxx **

*斜体*             * xxx *

***加粗加斜体***       * **  xxx    * **

~~废弃特性~~            ~~ xxx ~~



# 引用



> 选择狂神说JAVA 。。。。。



# 分割线

---

三个减号 ---

或是三个星号 ***

***



# 图片



![本地截图](D:\BaiduNetdiskDownload\13：主流教材电子书\Snipaste_2023-04-08_22-13-03.jpg)





# 超链接

[点击跳转到我的CSDN博客](https://blog.csdn.net/will59634788?spm=1010.2135.3001.5421)

写到网页上时跳转会有效，本身markdown不支持打开超链接



# 列表

1. a       1.+空格
2. b
3. c
4. d



- a         -空格
- b
- c
- d



# 表格



|      |      |      |
| ---- | ---- | ---- |
|      |      |      |
|      |      |      |
|      |      |      |

右键插入  表格，最快的方式



# 代码

```java
public class Person{
    String name;
    int age;
}
```

三个点  ``` +编程语言 回车即可



# JAVA反射机制

## 动态语言  



是一类在运行时可以改变其结构的语言：例如新的函数、对象、甚至代码可以被引进，已有的函数可以被删除或是其他结构上的变化。通俗点说就是在运行时代码可以根据某些条件改变自身结构。
主要动态语言：Object-C、C＃、JavaScript、PHP、Python等。

## 静态语言

与动态语言相对应的，运行时结构不可变的语言就是静态语言。如Java、C、C++
Java不是动态语言，但Java可以称之为“准动态语言”。即Java有一定的动态性我们可以利用反射机制获得类似动态语言的特性。Java的动态性让编程的时候更加灵活！

## Reflection（反射）



Reflection（反射）是Java被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。
Class c=Class.forName("java.lang.String”)
加载完类之后，在堆内存的方法区中就产生了一个Class类型的对象（一个类只有一个Class对象），这个对象就包含了完整的类的结构信息。我们可以通过这个对象看到类的结构。这个对象就像一面镜子，透过这个镜子看到类的结构，所以，我们形象的称之为：反射

## 优缺点



优点：
可以实现动态创建对象和编译，体现出很大的灵活性
缺点：
对性能有影响。使用反射基本上是一种解释操作，我们可以告诉JVM，我们希望做什么并且它满足我们的要求。这类操作总是慢于直接执行相同的操作。

![反射图解](D:\BaiduNetdiskDownload\13：主流教材电子书\Snipaste_2023-04-08_23-10-02.jpg)

## 哪些类型可以有Class对象？



class：外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
interface：接口
［］：数组
enum：枚举
annotation：注解＠interface
primitive type：基本数据类型
void



```java
package Day11;
//实体类 user用户
public class User {
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

```

```jav
package Day11;

public class Test1 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("Day11.User");
        System.out.println(c1);

        Class c2 = Class.forName("Day11.User");
        Class c3 = Class.forName("Day11.User");
        Class c4 = Class.forName("Day11.User");
        //一个类在内存中智游一个class对象！在内存中加载后，
        // 类的整个结构都被封装在class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
//        class Day11.User
//        932583850
//        932583850
//        932583850




    }
}

```

```java
package Day11;

import java.lang.annotation.ElementType;

public class Test2 {
    public static void main(String[] args) {
        Class c1 = Object.class;        //类
        Class c2 = Comparable.class;    //接口
        Class c3 = String[].class;      //一维数组
        Class c4 = int[][].class;      //二维数组
        Class c5 = Override.class;       //注解
        Class c6 = ElementType.class;     //枚举
        Class c7 = Integer.class;         //基本数据类型
        Class c8 = void.class;          //void
        Class c9 = Class.class;          //Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);


        //只要元素和维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
//    class java.lang.Object
//    interface java.lang.Comparable
//    class [Ljava.lang.String;
//    class [[I
//    interface java.lang.Override
//    class java.lang.annotation.ElementType
//    class java.lang.Integer
//    void
//    class java.lang.Class
//         932583850
//        932583850
```





## 反射机制能做什么



在运行时判断任意一个对象所属的类
在运行时构造任意一个类的对象
在运行时判断任意一个类所具有的成员变量和方法
在运行时获取泛型信息
在运行时调用任意一个对象的成员变量和方法
在运行时处理注解
生成动态代理


Class类对象照镜子后可以得到的信息：某个类的属性、方法和构造器、某个类到底实现了哪些接口。对于每个类而言，JRE都为其保留一个不变的Class类型的对象。一个Class对象包含了特定某个结构（class／interface／enum／annotation／primitive type／void／［］）的有关信息。
Class本身也是一个类
Class 对象只能由系统建立对象
一个加载的类在JVM中只会有一个Class实例
一个Class对象对应的是一个加载到JVM中的一个.class文件
每个类的实例都会记得自己是由哪个Class 实例所生成
通过Class可以完整地得到一个类中的所有被加载的结构
Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象

# 并发编程

并发编程本质是充分利用CPU资源，多个线程同时执行，线程池
线程的状态，六个
NEW新生  RUNNABLE运行 BLOCKED阻塞 WAITING等待  TIMED_WAITING超时等待  TERMINATED终止
wait／sleep区别
    1、来自不同的类
        wait =>Object
        sleep => Thread
    2、关于锁的释放
        wait 会释放铁，sleep睡觉了。抱着锁睡觉，不会释放！
    3、使用的范围是不同的
        wait  必须在同步代码块中
        sleep 可以再任何地万睡
     4、是否需要捕获异常
        wait 不需要插获异常
        sleep 必须要插获异常

synchronized本质是排队队列，锁





# 对象流

Java对象流是一种I／O流，可以用于读取和写入Java对象。
·这些对象可以是任何Java类的实例，只要这些类实现了java.io.Serializable接口。

FilelnputStream和FileOutputStream是字节流，用于读取和写入文件。
它们的构造函数都需要传入File对象或文件路径名。

序列化和反序列化
·序列化是将Java对象转换为字节序列的过程，这些字节序列可以在文件或网络连接中进行传输。
·反序列化是将字节序，并换回Java对象的过程。
·ObjectOutputStream和ObjectInputStream可以用于将Java对象序列化为字节流
并将其写入文件或网络连接，也可以将字节流反序列化为Java对象。
·它们提供了一种方便的方式来持久化Java对象

## Serializable接口

·要使用对象流，Java类必须实现java.io.Serializable接口。
·Serializable接口是一个标记接口，它没有任何方法或字段，仅用于表示类可以被序列化。
·在实现Serializable接口时，需要注意以下几点：
所有字段都必须是可序列化的。如果一个字段是一个对象，
那么该对象的类也必须实现Serializable接口。transient关键字可以用于标记不希望序列化的字段。
如果一个类的父类没有实现Serializable接口，则需要确保父类的无参构造函数可以被调用。



 # 缓冲流

​    ·在读写数据时，经常会发现IO操作非常耗时，
​    这是因为每次读写操作都会涉及到磁盘或网络IO，而这种IO操作是非常慢的。
​    ·为了提高IO操作的效率，Java提供了缓冲流。
​    缓冲流是基于字节流和字符流之上的一层，是处理流的一种，
​    它可以将数据缓存到内存中，减少实际IO操作的次数。
​    ·在读取数据时，缓冲流会预先读取一定量的数据到缓存中，
​    当应用程序需要读取数据时，缓冲流会先从缓存中读取，
​    如果缓存中没有数据了，就再去进行实际的IO操作。
  在Java中，缓冲流有四种类型：
​    BufferedInputStream：字节缓冲输入流。
​    BufferedOutputStream：字节缓冲输出流。
​    BufferedReader：字符缓冲输入流。

BufferedWrite: 字符缓冲输出流。



# 序列化  反序列化



·序列化是将Java对象转换为字节序列的过程，这些字节序列可以在文件或网络连接中进行传输。
·反序列化是将字节序，并换回Java对象的过程



   当我们在使用java编程的时候，肯定会使用到**serialversionuid，**
   但很多情况下并不知道serialversionuid的作用是什么，其实它就是一种语言序列化的机制。
   serialversionuid的作用：答：serialversionuid的作用是验证版本一致性。
   如果serialversionuid一致，说明他们的版本是一样的。反之，就说明版本不同，
   就无法运行或使用相关功能。
1、serialversionuid是java中的一种序列化机制。

2、当我们进行序列化操作时，会把当前的版本写入到文件之中。
3、在运行的时候，它就会监测当前版本的serialversionuid与编写版本是否一致。
4、一般来说，默认的serialversionuid是“1L”，在没有手动修改的情况下就是这个。
5、还有一些时候会通过接口名、成员数等属性生成，那就是“serialVersionUID = xxxxL”
6、如果我们发现运行错误，一般会出现“warning”的代码，这时候将他改为“ignore”即可解决。



# 数据库MySQL

安装好后在命令行操作

![数据库命令行操作进入](C:\Users\86131\Desktop\IDEA错误集合+知识点\Snipaste_2023-04-11_23-09-24.jpg)

