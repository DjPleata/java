package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("Curs3/src/file/FileReader.java");
            try {
                int c;
                while ((c =  file.read()) != -1){
                    System.out.print((char) c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
