package section3.observerPatternHomework.detailedSolution.subjects;

import section3.observerPatternHomework.detailedSolution.observers.IObserver;

public interface ISubject {

    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
