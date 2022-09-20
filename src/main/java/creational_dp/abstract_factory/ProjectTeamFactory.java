package creational_dp.abstract_factory;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
