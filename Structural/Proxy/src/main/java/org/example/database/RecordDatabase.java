package org.example.database;

import org.example.database.Database;

import java.util.ArrayList;
import java.util.List;

class RecordDatabase implements Database {

    List<String> records;

    protected RecordDatabase() {
        records = new ArrayList<>();
    }

    @Override
    public List<String> getRecords() {
        return records;
    }

    @Override
    public void addRecord(String s) {
        records.add(s);
    }
}
