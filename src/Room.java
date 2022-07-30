import java.math.BigDecimal;


public class Room {
    private int numRoom;
    private int numBeds;
    private boolean balcony,seeSea;
    private BigDecimal price;


    public Room(int numRoom, int numBeds, boolean balcony, boolean seeSea, BigDecimal price) {
        this.numRoom = numRoom;
        this.numBeds = numBeds;
        this.balcony = balcony;
        this.seeSea = seeSea;
        this.price = price;
    }

    public String getDescription() {
        return "Pokoj čislo: "+numRoom+getStringBeds()+
                getStringBalcony()+getStringSea()+", cena za noc: "+price+ " Kč ";
    }
    private String getStringBalcony() { return balcony ? " s balkónem" : " bez balkónu"; }

    private String getStringSea() { return seeSea ? " s výhledem na moře" : " bez výhledu na moře"; }

    private String getStringBeds() {
        if (this.numBeds == 1){
            return " s jednou postelí";
        } else if (this.numBeds > 1) {
            return " s počtem postelí: "+this.numBeds;
        }
        return " bez postelí";
    }

    public int getNumRoom() { return numRoom; }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeeSea() {
        return seeSea;
    }

    public void setSeeSea(boolean seeSea) {
        this.seeSea = seeSea;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
