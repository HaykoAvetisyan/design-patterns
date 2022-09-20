package creational_dp.abstract_factory.banking;

import creational_dp.abstract_factory.Manager;
import solid.interface_sagregation.Machine;

public class BankingPM implements Manager {

    @Override
    public void manageProject() {
        System.out.println("Managing banking project");
    }
}
