package org.example;

import org.example.database.Database;
import org.example.database.RecordDatabaseProxy;

public class Main {
    public static void main(String[] args) {
        Database recordDatabase = new RecordDatabaseProxy();
        recordDatabase.addRecord("First Record!");
        recordDatabase.addRecord("Second Record!");
        recordDatabase.addRecord("Third Record!");

        for (String record : recordDatabase.getRecords()) {
            System.out.println(record);
        }

    }
}