package Day12;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //创建File对象，表示当前工作目录下的example.txt文件
        File file = new File("D:\\BaiduNetdiskDownload\\JavaWeb-资料\\day14-综合案例\\资料\\01-初始工程\\lalapodoStudyJava", "example2.txt");
        //检查文件是否存在
        if (file.exists()) {
            System.out.println("文件存在");
//            检查是否是文件
            if (file.isFile()) {
                System.out.println("是文件");
            } else {
                System.out.println("不是文件");
            }
            //获取文件名和路径
            System.out.println("文件名是：" + file.getName());
            System.out.println("文件路径是：" + file.getPath());
            System.out.println("文件绝对路径：" + file.getAbsolutePath());
            //删除文件
            boolean delete = file.delete();
            if (delete) {
                System.out.println("文件已经删除");
            } else {
                System.out.println("文件删除失败");
            }
        } else {
            System.out.println("文件不存在");

        }
        //创建目录
        File mydir = new File("mydir");
        boolean mkdir = mydir.mkdir();
        if (mkdir) {
            System.out.println("目录创建成功");
//          检查是否是目录
            if(mydir.isDirectory()){
                System.out.println("是目录");
            }else {
                System.out.println("不是目录");
            }
            //获取目录下的文件和子目录
            String[] list = mydir.list();
            for (String filename:list) {
                System.out.println(filename);
            }
            //删除目录
            boolean delete = mydir.delete();
            if(delete){
                System.out.println("目录已经删除");
            }else {
                System.out.println("目录删除失败");
            }
        }else {
            System.out.println("目录创建失败");
        }
    }
}
//        文件存在
//         是文件
//        文件名是：example2.txt
//        文件路径是：D:\BaiduNetdiskDownload\JavaWeb-资料\day14-综合案例\资料\01-初始工程\lalapodoStudyJava\example2.txt
//        文件绝对路径：D:\BaiduNetdiskDownload\JavaWeb-资料\day14-综合案例\资料\01-初始工程\lalapodoStudyJava\example2.txt
//        文件已经删除
//        目录创建成功
//        是目录
//        目录已经删除