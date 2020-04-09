package lecture9.reader.character;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("/home/kiemnx/Pictures/1.png");
        BufferedReader br = new BufferedReader(fr);
        //Cach 1
        /*int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }*/

        //Cach 2
        String line = "";
        while (true) {
            line = br.readLine();
            if(line == null){
                break;
            }
            System.out.print(line);
        }

        br.close();
        fr.close();
    }
}


