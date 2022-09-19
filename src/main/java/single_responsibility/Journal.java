package single_responsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private int count = 0;


    public void add(String entry) {
        entries.add("" + (++count) + entry);
    }

    public void remove(int index) {
        entries.remove(index);
    }

    public void save(String filename) {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String filename) throws FileNotFoundException{}
    public void load(URL url){}


    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

}
