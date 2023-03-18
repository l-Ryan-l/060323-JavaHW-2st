import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

//Task 2:
//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Task2_TestRepeat {
    static Logger logger = Logger.getLogger("checkWriting");
    public static void main(String[] args) {
        String someStr = "TEST";
//        repeat100Times(someStr);
        writeDownInFile(repeat100Times(someStr));
    }

    public static StringBuilder repeat100Times(String someStr) {
        StringBuilder sb = new StringBuilder(someStr.repeat(100));
        return sb;
    }

    public static void writeDownInFile(StringBuilder sb) {
        try(PrintWriter pw = new PrintWriter("test.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            logger.severe(e.getMessage());
            throw new RuntimeException(e);
        }

    }

}
