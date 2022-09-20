package creational_dp.abstract_factory.banking;

import creational_dp.abstract_factory.Developer;
import creational_dp.abstract_factory.Manager;
import creational_dp.abstract_factory.ProjectTeamFactory;
import creational_dp.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
