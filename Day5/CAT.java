package Day5;

public class CAT implements PET{
    @Override
    public void eat() {
        System.out.println("喵喵喵");
    }

    @Override
    public void cry() {
        System.out.println("crying..........");
    }
}
class main1{
    public static void main(String[] args) {
        CAT cat = new CAT();
        cat.eat();
        PET.sleep();//直接调用，实现的接口里的已有方法
        cat.cry();//直接重写实现的接口里的已有方法
    }
}