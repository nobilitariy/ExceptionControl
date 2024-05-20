import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public void readFile(String nameFile){
        try (BufferedReader fileReader = new BufferedReader(new FileReader(nameFile+".txt"))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
               System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Неудалось найти или считать файл");
        }
    }
}
