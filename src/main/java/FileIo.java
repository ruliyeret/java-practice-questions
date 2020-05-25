import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIo {

    public static byte[] read(String path){
        try {
          return  Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    };

    public static void write(byte[] data, String path){
        try {
            Files.write(Paths.get(path), data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
