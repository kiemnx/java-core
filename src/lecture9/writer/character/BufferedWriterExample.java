package lecture9.writer.character;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("/home/kiemnx/project/plus/plusplus/fileout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("This is first line");
        buffer.newLine();
        buffer.write("This is second line");
        buffer.close();
        System.out.println("Success...");
    }

}


