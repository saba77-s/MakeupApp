package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public interface SavableAndLoadable {
    void save() throws FileNotFoundException, UnsupportedEncodingException;

    void load() throws IOException;
}
