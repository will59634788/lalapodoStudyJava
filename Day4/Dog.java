package Day4;

public class Dog extends Pet{

   @Override  //用于让编译器检查是否正确重写了父类方法
    public void cry(){
       System.out.println("汪汪汪。。。");
   }



}
