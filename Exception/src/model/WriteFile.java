import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeFile(Human human) {
        String nameFile = human.getLastname() + ".txt";
File file = new File(nameFile);
try (FileWriter fileWriter = new FileWriter(file, true)) {
    if (!file.exists()) {
        file.createNewFile();
    }
    fileWriter.write(human.toString() + "\n");
} catch (IOException e) {
    System.out.println("Ошибка записи в файл: " + e.getMessage());
}
    }
}
