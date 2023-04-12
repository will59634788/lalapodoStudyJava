package Day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//FilelnputStream和FileOutputStream是字节流，用于读取和写入文件。
//它们的构造函数都需要传入File对象或文件路径名。
public class Test3 {
    public static void main(String[] args) {
        File file = new File("example3.txt");
        try(FileInputStream fileInputStream = new FileInputStream("example3.txt")){
            byte[] bytes = new byte[1024];
            int read;
            while((read = fileInputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,read));
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try(FileOutputStream fos = new FileOutputStream(file)){
            //把字符串"sssssss"写入文件example3.txt
            final byte[] bytes = "sssssss".getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
        }catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}
