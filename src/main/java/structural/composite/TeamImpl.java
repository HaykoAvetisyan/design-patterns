package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamImpl implements Team {

    private List<Developer> developers = new ArrayList<>();

    @Override
    public void createPoject() {
        System.out.println("Team creates project   ");
        for (Developer developer : developers) {
            developer.writeCode();
        }

    }

    @Override
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    @Override
    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }
}
