import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Application
{
    public static void main(String[] args)
    {
        File prob2 = new File("problem2.txt");
        File uniqueW = new File("unique_words_counts.txt");

        DuplicateCounter dupe = new DuplicateCounter();

        dupe.count(prob2);
        dupe.write(uniqueW);
    }
}
