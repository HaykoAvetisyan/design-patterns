package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();

        developerList.add(developerFactory.getDeveloperBySpecialty("Java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("Java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("Java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("Java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("C++"));

        for (Developer developer : developerList) {
           developer.writeCode();
        }

    }
}
