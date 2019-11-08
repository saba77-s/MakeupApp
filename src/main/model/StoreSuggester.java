package model;

import java.util.ArrayList;

public class StoreSuggester {

    int numberOfStores = 45;
    private ArrayList<Store> stores;

    public StoreSuggester() {
        stores = new ArrayList<>();
        for (int i = 0;i < numberOfStores;i++) {
            stores.add(i,null);
        }
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public void changeStoreHours(int hours,Store store) {
        store.setHours(hours);
    }

    public void suggestStore(Member member) {
        for (Store s : stores) {
            if (member.getAddress().equals(s.getCity())) {
                System.out.println(s);
            }
        }

    }
}
