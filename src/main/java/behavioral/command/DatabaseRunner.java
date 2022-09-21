package behavioral.command;



public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Daveloper developer = new Daveloper( new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database));

        developer.insert();
        developer.update();
        developer.select();
        developer.delete();

    }
}
