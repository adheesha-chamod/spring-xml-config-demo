package org.adheesha;

public class BackupDBConnection implements DBConnection {

    @Override
    public void connect() {
        System.out.println("Connected to Backup Database");
    }
}
