package lecture9.writer.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;

        try {
            fout = new FileOutputStream("/home/kiemnx/project/plus/plusplus/fileout.txt");
            bout = new BufferedOutputStream(fout);
            bout.write(66);
            bout.flush();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            bout.close();
            fout.close();
        }
    }
}
