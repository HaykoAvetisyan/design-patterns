package structural.facade;

public class Developer {

    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.activeSprint()){
            System.out.println("Developer is solving problems..");
        }else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }
}
