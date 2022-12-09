package org.example;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private List<String> querys;

    public static DatabaseConnection getInstance() {
        // Se for multi-thread é preciso colocar locks
        // para garantir que a classe não é instanciada mais que uma vez
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    protected DatabaseConnection() {
        querys = new ArrayList<>();
        System.out.println("Ligação criada com a BD");
    }

    public void showQueries() {
        System.out.println("A mostrar a lista de queries realizadas na BD");
        querys.forEach(System.out::println);
    }

    public void executeQuery(String query) {
        querys.add(query);
    }
}
