package creational_dp.singleton;

public class ProgramLogger {

    private static ProgramLogger programLogger;

    private static String LOG_FILE = "This is a log file";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {}


    public void addLogInfo(String loginfo) {
        LOG_FILE+=loginfo + "\n";

    }

    public void showLogFile(){
        System.out.println(LOG_FILE);
    }
}
