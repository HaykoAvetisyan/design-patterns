package structural.decorator;

public class Task {
    public static void main(String[] args) {
////        Developer developer = new JavaDeveloper();
//
//        System.out.println(developer.makeJob());

        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer.makeJob());


        Developer developer1 = new JavaTeamLead(new JavaDeveloper());
        System.out.println(developer1.makeJob());
    }
}
