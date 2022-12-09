package org.example.database;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class RecordDatabaseProxy implements Database{
    private RecordDatabase recordDatabase = null;


    @Override
    public List<String> getRecords() {
        initializeDatabaseIfNotYet();
        // Secure acess to database
        if (LocalDateTime.now().getHour() >= 18) {
            throw new RuntimeException("Não é possivel aceder aos dados de noite!");
        }
        return recordDatabase.getRecords();
    }


    @Override
    public void addRecord(String s) {
        initializeDatabaseIfNotYet();
        recordDatabase.addRecord(s);
    }

    //Method for lazy initialization
    private void initializeDatabaseIfNotYet() {
        if (recordDatabase == null) {
            recordDatabase = new RecordDatabase();
        }
    }
}
