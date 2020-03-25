package lecture9.reader.bytestream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamEx {
    public static void main(String[] args) throws IOException {
        InputStream input = null;
        DataInputStream dis = null;
        try {
            input = new FileInputStream("/home/kiemnx/project/plus/plusplus/file.txt");
            dis = new DataInputStream(input);
            int i;
            while ((i = dis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {

        } finally {
            dis.close();
        }
    }
}
