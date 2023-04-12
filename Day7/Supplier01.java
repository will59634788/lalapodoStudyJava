package Day7;

import java.util.Random;
import java.util.function.Supplier;
//Supplier 只返回一个值没有参数输入 ，表示对值的生成操作
public class Supplier01 {
    public static void main(String[] args) {
        Supplier supplier = ()-> new Random().nextInt(10);
        //从0到10随机生成一个数 不含10
        System.out.println(supplier.get());

//        Supplier<Integer> supplier2 = ()-> new Random().nextInt(10,20);
//        //从10到20随机生成一个数 不含10,20
//        System.out.println(supplier2.get());
    }
}
