import java.io.FileWriter;
import java.io.IOException;

public class SaveService {
    public static void saveFile(String pName, String pContent) {
        try (
                FileWriter writer = new FileWriter(pName, true)) {
            writer.write(pContent);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
