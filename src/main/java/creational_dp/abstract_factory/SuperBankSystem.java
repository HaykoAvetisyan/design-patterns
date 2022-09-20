package creational_dp.abstract_factory;

import creational_dp.abstract_factory.banking.BankingTeamFactory;
import creational_dp.abstract_factory.website.WebSiteTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();
        System.out.println("Creating SuperBankSystem");

        developer.writeCode();
        tester.testCode();
        manager.manageProject();

        System.out.println("----------------------------------------------------------------");
        System.out.println("website  project is created");
        ProjectTeamFactory projectTeamFactory1 = new WebSiteTeamFactory();
        Developer developer1 = projectTeamFactory1.getDeveloper();
        Tester tester1 = projectTeamFactory1.getTester();
        Manager manager1 = projectTeamFactory1.getManager();

        developer1.writeCode();
        tester1.testCode();
        manager1.manageProject();
    }
}
