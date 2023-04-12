package Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception03 {
    public static void main(String[] args) {
        FileRead  file = new FileRead();

        try {
            file.fileRead("test.txt");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }

    }
}
class FileRead{
    public void fileRead(String filename) throws FileNotFoundException, IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        bufferedReader.close();
    }
}