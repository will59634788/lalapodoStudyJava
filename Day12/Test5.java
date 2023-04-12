package Day12;

import java.io.*;
//     缓冲流
//        ·在读写数据时，经常会发现IO操作非常耗时，
//        这是因为每次读写操作都会涉及到磁盘或网络IO，而这种IO操作是非常慢的。
//        ·为了提高IO操作的效率，Java提供了缓冲流。
//        缓冲流是基于字节流和字符流之上的一层，是处理流的一种，
//        它可以将数据缓存到内存中，减少实际IO操作的次数。
//        ·在读取数据时，缓冲流会预先读取一定量的数据到缓存中，
//        当应用程序需要读取数据时，缓冲流会先从缓存中读取，
//        如果缓存中没有数据了，就再去进行实际的IO操作。

//      在Java中，缓冲流有四种类型：
//        BufferedInputStream：字节缓冲输入流。
//        BufferedOutputStream：字节缓冲输出流。
//        BufferedReader：字符缓冲输入流。
//        BufferedWriter:字符缓冲输出流。
public class Test5 {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("example3.txt"))) {
            byte[] bytes = new byte[1024];
            int n;
            while ((n = bufferedInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, n));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("example3.txt"))) {
            bufferedOutputStream.write("ssssssssss........".getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




