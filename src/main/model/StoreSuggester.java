package model;

import java.awt.*;
import java.util.ArrayList;

public class StoreSuggester {

    int numberOfStores = 45;
    public static ArrayList<Store> stores;


    public StoreSuggester() {
        stores = new ArrayList<>();
        for (int i = 0;i < numberOfStores;i++) {
            stores.add(i,null);
        }
        stores.add(new Store("georgia",9));
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public void changeStoreHours(int hours,Store store) {
        store.setHours(hours);
    }

    public Store suggestStore(Member member) {
        for (Store s : stores) {
            if (member.getAddress().equals(s.getCity())) {
                return s;
            }
        }
        return null;
    }
}
