package org.adheesha;

public class BackupDBConnection implements DBConnection {

//    public BackupDBConnection() {
//        System.out.println("BackupDBConnection object is created!");
//    }

    @Override
    public void connect() {
        System.out.println("Connected to Backup Database");
    }
}
