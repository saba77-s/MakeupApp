package ui;

import java.util.ArrayList;

public interface Cosmetics {
    //MODIFIES: Arraylist foundationl
    //EFFECTS: insert the string into the arraylist unless it's already in there.
    void  insert(String i, ArrayList foundationl);
    //EFFECTS: returns true if the string is in the arraylist and false otherwise
    boolean contains(String foundation, ArrayList foundationl);

}
