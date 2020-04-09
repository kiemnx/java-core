package lecture9.writer.character;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("/home/kiemnx/project/plus/plusplus/fileout.txt", true);
        PrintWriter buffer = new PrintWriter(writer);

        buffer.println("This is first line");
        buffer.println("This is second line");

        buffer.close();
        System.out.println("Success...");
    }

}


