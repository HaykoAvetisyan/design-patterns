package single_responsibility;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.add("I cried today");
        journal.add("I ate bugs and warnings");
        System.out.println(journal);

        Persistence p = new Persistence();
        String filename ="C:\\users\\test.txt";
        p.saveToFile(journal,filename,true);

        Runtime.getRuntime().exec("notepad.exe " + filename);

    }
}
