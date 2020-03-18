package lecture7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CheckedException {

    public static void main(String[] args) {
        CheckedException object = new CheckedException();
        object.readFile();

    }

    public String readFile() {

        try {
            new String(Files.readAllBytes(new File("").toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

