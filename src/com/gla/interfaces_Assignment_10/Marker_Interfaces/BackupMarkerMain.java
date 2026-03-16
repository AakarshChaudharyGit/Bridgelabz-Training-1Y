package com.gla.interfaces_Assignment_10.Marker_Interfaces;
interface Backup {}

class FileData implements Backup {}

public class BackupMarkerMain {
    public static void main(String[] args) {
        FileData f = new FileData();

        if (f instanceof Backup)
            System.out.println("Backup allowed");
    }
}
