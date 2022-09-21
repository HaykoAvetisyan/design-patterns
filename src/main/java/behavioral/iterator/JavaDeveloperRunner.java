package behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String [] skills = {"Java", "Autumn", "Maven", "Hibernate", "SQl"};


        JavaDeveloper javaDeveloper = new JavaDeveloper("Hayk", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills: ");


        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
