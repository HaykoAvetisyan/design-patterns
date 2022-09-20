package creational_dp.abstract_factory.website;

import creational_dp.abstract_factory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Writing PHP Code");
    }
}
