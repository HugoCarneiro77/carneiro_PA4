import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover
{
    private Set <String> uniqueHash;

    public void remove(File dataFile)
    {
        try
        {
            String uniqueWord, wordA, wordB;
            Scanner sc = new Scanner(dataFile);
            PrintWriter output = new PrintWriter(dataFile);
            uniqueHash = new HashSet<String>();

            while(sc.hasNext())
            {
                wordA = sc.next();
                System.out.print(wordA);
                wordB = sc.next();
                System.out.print(wordB);
            }

            output.close();
        }
        catch (IOException err)
        {
            System.out.printf("ERROR: %s\n", err);
        }
    }

    public void write(File outputFile)
    {
        try
        {
            String uniqueWord, wordA, wordB;
            Scanner sc = new Scanner(outputFile);
            PrintWriter output = new PrintWriter(outputFile);
            uniqueHash = new HashSet<String>();


            output.close();
        }
        catch (IOException err)
        {
            System.out.printf("ERROR: %s\n", err);
        }
    }
}
