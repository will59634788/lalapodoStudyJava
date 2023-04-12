package Day7;

import java.util.function.Consumer;
//Consumer 接受单个输入参数没有返回值，是对输入参数的消费操作
public class Consumer01 {
    public static void main(String[] args) {
        Consumer<String> consumer= System.out::println;
        consumer.accept("hello java");
        Consumer<String> consumer1 = s -> System.out.println(s.length());
        consumer.andThen(consumer1).accept("hi...");

    }
}
