package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report to consumer";
    }

    public String makeJob(){
        return super.makeJob() + sendWeekReport();
    }
}
