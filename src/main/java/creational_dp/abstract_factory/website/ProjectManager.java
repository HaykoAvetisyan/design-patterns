package creational_dp.abstract_factory.website;

import creational_dp.abstract_factory.Manager;

public class ProjectManager implements Manager {

    @Override
    public void manageProject() {
        System.out.println("Managing project website");
    }
}
