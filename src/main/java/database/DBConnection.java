package database;

public enum DBConnection {

    MAIN_DB(1);

    private final int reference;

    DBConnection(int reference) {
        this.reference = reference;
    }

    public int getReference() {
        return reference;
    }

}
