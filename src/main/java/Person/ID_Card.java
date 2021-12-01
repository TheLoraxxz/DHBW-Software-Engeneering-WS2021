package main.java.Person;

public class ID_Card {
    public String getIDCode() {
        return rfidChip.getID();
    }

    private RFIDChip rfidChip;

    public ID_Card(String name, int code) {
        rfidChip = new RFIDChip("FT-DUS-FLF-5" + name + code);
    }
}
