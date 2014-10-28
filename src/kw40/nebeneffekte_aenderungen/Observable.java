package kw40.nebeneffekte_aenderungen;

import java.util.LinkedList;
import java.util.List;

public class Observable {
	private List<Observer> observers = new LinkedList<Observer>();

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {

        /*Iterator<Observer> it = observers.iterator();
        while (it.hasNext())
        {
            it.next().update(this);
        }*/

        for (int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(this);
        }

	}
}
