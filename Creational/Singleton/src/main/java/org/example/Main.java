package org.example;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * from TABLE");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("SELECT COLUMN FROM TABLE");

        db2.showQueries();
    }
}