package org.adheesha;

public class PrimaryDBConnection implements DBConnection {

    public PrimaryDBConnection() {
//        System.out.println("PrimaryDBConnection object is created!");
    }

    @Override
    public void connect() {
        System.out.println("Connected to Primary Database");
    }
}
