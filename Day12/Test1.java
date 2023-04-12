package Day12;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduNetdiskDownload\\JavaWeb-资料\\day14-综合案例\\资料\\01-初始工程\\lalapodoStudyJava\\src\\main\\java\\Day12");
        boolean exists = file.exists();
        System.out.println(exists); // true

       //根据给定父路径和子路径字符串创建File对象
        File file1 = new File("D:\\BaiduNetdiskDownload\\JavaWeb-资料\\day14-综合案例\\资料\\01-初始工程\\lalapodoStudyJava", "example.txt");
        boolean exists1 = file1.exists();
        System.out.println(exists1);    // true



    }

}
