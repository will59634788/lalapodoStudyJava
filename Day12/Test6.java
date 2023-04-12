package Day12;

import java.io.*;
//        BufferedReader：字符缓冲输入流。
//        BufferedWriter: 字符缓冲输出流。
public class Test6 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example3.txt"))) {
            char[] chars = new char[1024];
            int n;
            while ((n = bufferedReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, n));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example3.txt"))) {
            bufferedWriter.write("ssssssssss3........");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}