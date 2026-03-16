package com.gla.interfaces_Assignment_10.DEFAULT_METHODS;
interface Exporter {
    void exportCSV();

    default void exportJSON() {
        System.out.println("Export JSON");
    }
}

class Report implements Exporter {
    public void exportCSV() {
        System.out.println("CSV Exported");
    }
}

public class ExportFeatureMain {
    public static void main(String[] args) {
        Exporter e = new Report();
        e.exportJSON();
    }
}
