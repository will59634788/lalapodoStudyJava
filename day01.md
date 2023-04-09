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

Class类对象照镜子后可以得到的信息：某个类的属性、方法和构造器、某个类到底实现了哪些接口。对于每个类而言，JRE都为其保留一个不变的Class类型的对象。一个Class对象包含了特定某个结构（class／interface／enum／annotation／primitive type／void／［］）的有关信息。
Class本身也是一个类
Class 对象只能由系统建立对象
一个加载的类在JVM中只会有一个Class实例
一个Class对象对应的是一个加载到JVM中的一个.class文件
每个类的实例都会记得自己是由哪个Class 实例所生成
通过Class可以完整地得到一个类中的所有被加载的结构
Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象
