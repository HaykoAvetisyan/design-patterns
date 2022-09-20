package creational_dp.factory;

public class PhpDeveloperFactory implements DeveloperFactory{


    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
