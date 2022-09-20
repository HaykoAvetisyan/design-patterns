package structural.adapter;

public class DataBaseRunner {

    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();

        dataBase.insert();
        dataBase.update();
        dataBase.remove();
        dataBase.select();

    }
}
