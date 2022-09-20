package creational_dp.abstract_factory.website;

import creational_dp.abstract_factory.Developer;
import creational_dp.abstract_factory.Manager;
import creational_dp.abstract_factory.ProjectTeamFactory;
import creational_dp.abstract_factory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new ProjectManager();
    }
}
