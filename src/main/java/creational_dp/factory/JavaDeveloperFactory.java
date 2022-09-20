package creational_dp.factory;

public class JavaDeveloperFactory implements DeveloperFactory{


    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
