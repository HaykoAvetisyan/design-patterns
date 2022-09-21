package behavioral.visitor;

public class SeniorDeveloper implements Developer{


    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class... ");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing db...");

    }

    @Override
    public void create(Test test) {
        System.out.println("fixing tests");
    }
}
