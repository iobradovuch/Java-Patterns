package ua.iobradovuch.lab3.observer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class QuestSubject {
    private List<QuestObserver> observers = new ArrayList<>();

    public void addObserver(QuestObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(QuestObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}