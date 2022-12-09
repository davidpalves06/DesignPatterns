package org.example.database;

import java.io.IOException;
import java.util.List;

public interface Database {
    public List<String> getRecords();
    public void addRecord(String s);

}
