package model;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.HashMap;

public class Matcher {

    HashMap<Brands, ArrayList<Ambassador>> influence = new HashMap<>();
    Ambassador tammy = new Ambassador("10m", "tammy");
    Ambassador lora = new Ambassador("8m", "lora");
    Ambassador james = new Ambassador("20m","james");
    Ambassador jake = new Ambassador("5m", "jake");
    Ambassador anncy = new Ambassador("1m", "anncy");
    Ambassador jas = new Ambassador("500k", "jas");

    Brands loreal = new Brands("LOreal", tammy, 2000);
    Brands maybeline = new Brands("Mybeline", lora, 6000);
    Brands rimmel = new Brands("Rimmel", james, 10000);

    public Matcher() {
        influence.put(loreal, new ArrayList<>());
        influence.put(maybeline,new ArrayList<>());
        influence.put(rimmel,new ArrayList<>());
        ArrayList<Ambassador> tempInfluenceL = influence.get(loreal);
        tempInfluenceL.add(jake);
        tempInfluenceL.add(anncy);
        tempInfluenceL.add(jas);
        ArrayList<Ambassador> tempInfluenceM = influence.get(maybeline);
        tempInfluenceM.add(jake);
        tempInfluenceM.add(anncy);
        tempInfluenceM.add(jas);
        ArrayList<Ambassador> tempInfluenceR = influence.get(rimmel);
        tempInfluenceR.add(jake);
        tempInfluenceR.add(anncy);
        tempInfluenceR.add(jas);
    }



}
