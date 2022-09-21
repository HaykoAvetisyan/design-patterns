package structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean activeSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Spring is not active");
        activeSprint=false;
    }
}
