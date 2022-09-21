package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();

    public void addVacancy(String vacancyName){
        this.vacancies.add(vacancyName);
        notifyObservers();
    }

    public void removeVacancy(String vacancyName){
        this.vacancies.remove(vacancyName);
        notifyObservers();
    }






    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribes) {
            observer.handleEvent(this.vacancies);
        }
    }
}
