package Day12;

import java.io.*;
import java.nio.charset.StandardCharsets;

//FilelnputStream和FileOutputStream是字节流，用于读取和写入文件。
//它们的构造函数都需要传入File对象或文件路径名。
public class Test4 {
    public static void main(String[] args) {
        File file = new File("example3.txt");
        try( FileReader reader = new FileReader("example3.txt")){
             char[] chars = new char[1024];
            int read;
            while((read = reader.read(chars))!=-1){
                System.out.println(new String(chars,0,read));
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try( FileWriter writer = new FileWriter(file)){
            //把字符串"sssssss"写入文件example3.txt
            String hello = "hello.......";
            writer.write(hello);
        }catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}
