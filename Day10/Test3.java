package Day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//反射
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("Day10.Person");
        Class<? extends Person> aClass1 = new Person().getClass();
        Class<Person> personClass = Person.class;
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        Person tom = (Person) constructor.newInstance("tom", 25);
        Field name = aClass.getDeclaredField("name");
        Field age = aClass.getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);
        name.set(tom,"jerry");
        age.set(tom,30);
        Method sayHello = aClass.getMethod("sayHello");
        sayHello.invoke(tom);
        Method hello = aClass.getMethod("hello");
        hello.invoke(null);

    }
}
