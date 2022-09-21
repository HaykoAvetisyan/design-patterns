package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("Senior java dev");
        site.addVacancy("Middle java dev");

        Observer firstSubscribe = new Subscriber("Hayk");
        Observer secondSubscribe = new Subscriber("Hovo");
        Observer thirdSubscribe = new Subscriber("Mxo");


        site.addObserver(firstSubscribe);
        site.addObserver(secondSubscribe);
        site.addObserver(thirdSubscribe);

        site.addVacancy("C++ dev");

        site.removeVacancy("Senior java dev");

    }
}
