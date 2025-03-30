package org.adheesha;

public class DBConnector {

    private DBConnection dbConnection;

    public void connectToDatabase() {
        dbConnection.connect();
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
