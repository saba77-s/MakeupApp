package observer;

import model.Brands;
import model.Store;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<BrandObservers> observers = new ArrayList<>();

    public void addObserver(BrandObservers brandObservers) {
        if (!observers.contains(brandObservers)) {
            observers.add(brandObservers);
        }
    }

    public void notifyObservers(Brands brand) {
        for (BrandObservers observer:observers) {
            observer.update(brand);
        }
    }
}
