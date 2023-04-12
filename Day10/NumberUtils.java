package Day10;
//泛型
public class NumberUtils {
    public static <T extends Number> double average(T[] numbers){
        double sum = 0.0;
        for (T number: numbers) {
            sum += number.doubleValue();
        }
        return sum/ numbers.length;
    }
    public static void main(String[] args){
        Integer[] integers = {1,2,3,4,5};
        double avg = NumberUtils.average(integers);
        System.out.println("Average平均值是："+avg);
    }
}
