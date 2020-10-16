package utilites;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Filereader {
    public static String getTextFromFile(String path){
        String text = null;

        try {
            text = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;

    }
}
