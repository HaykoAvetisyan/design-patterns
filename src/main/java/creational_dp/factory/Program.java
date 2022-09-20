package creational_dp.factory;


public class Program {
    public static void main(String[] args) {
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//
//        javaDeveloper.writeJavaCode();
//
//        CppDeveloper cppDeveloper = new CppDeveloper();
//
//        cppDeveloper.writeCppCode();

//        Developer developer = new CppDeveloper();
//        developer.writeCode();

        DeveloperFactory developerFactory1 = createDeveloperFactoryBySpecialty("Java Developer");


        Developer developer = developerFactory1.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("Java Developer")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("Cpp Developer")) {
            return new CppDeveloperFactory();
        } else {
            throw  new RuntimeException("unknown specialty");
        }
    }
}
