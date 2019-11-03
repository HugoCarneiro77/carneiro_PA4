import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Application
{
    public static void main(String[] args)
    {
        File prob1 = new File("problem1.txt");
        File uniqueW = new File("unique_words.txt");

        DuplicateRemover dupe = new DuplicateRemover();

        if(prob1.exists() && !prob1.isDirectory())
        {
            dupe.remove(prob1);
        }
    }
}
