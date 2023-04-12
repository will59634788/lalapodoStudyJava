package Day3;

public class String02 {
    public static void main(String[] args) {
        String name = "hello java just have fun         "+"      !!!"+888;
        System.out.println(name);
        System.out.println(name.indexOf("n"));//第一个字母n的下标索引 ：23
        System.out.println(name.lastIndexOf("!"));//最后一个感叹号下标索引：45
        System.out.println(name.length());
        System.out.println(name.substring(4,10));//前开后闭区间
        System.out.println(name.trim());//去除首尾空格
        System.out.println(name.replace("java","c++"));

    }
}
