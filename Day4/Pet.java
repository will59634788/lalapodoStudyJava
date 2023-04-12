package Day4;

public   class Pet {
    private String name;
     public void cry(){   //有final，static 关键字是，方法不能被子类重写
        System.out.println("叫。。。");
    }
}
