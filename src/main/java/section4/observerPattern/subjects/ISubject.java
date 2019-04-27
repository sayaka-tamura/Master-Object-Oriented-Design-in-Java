package section4.observerPattern.subjects;

import section4.observerPattern.observers.IObserver;

public interface ISubject {

	void registerObserver(IObserver observer);

	void removeObserver(IObserver observer);

	void notifyObservers();
}
