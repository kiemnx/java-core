package lecture9.reader.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("/home/kiemnx/project/plus/plusplus/file.txt");
            int i = 0;
            while (true) {
                i = fin.read();
                if(i == -1){
                    break;
                }
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
    }
}


