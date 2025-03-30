package org.adheesha;

public class PrimaryDBConnection implements DBConnection {

    @Override
    public void connect() {
        System.out.println("Connected to Primary Database");
    }
}
