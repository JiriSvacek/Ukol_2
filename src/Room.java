import java.math.BigDecimal;


public class Room {
    int numRoom, numBeds;
    boolean balcony,seeSea;
    BigDecimal price;


    public Room(int numRoom, int numBeds, boolean balcony, boolean seeSea, BigDecimal price){
        this.numRoom = numRoom;
        this.numBeds = numBeds;
        this.balcony = balcony;
        this.seeSea = seeSea;
        this.price = price;
    }

    public String getDescription(){
        return "Pokoj čislo: "+this.numRoom+getStringBeds()+
                getStringBalcony()+getStringSea()+",cena na noc: "+this.price+ " Kč";
    }
    private String getStringBalcony() {
        if (this.balcony) {
            return " s balkónem";
        } else {
            return " bez balkónu";
        }
    }

    private String getStringSea() {
        if (this.seeSea) {
            return " s výhledem na moře";
        } else {
            return " bez výhledu na moře";
        }
    }

    private String getStringBeds() {
        if (this.numBeds == 1){
            return " s jednou postelí";
        } else if (this.numBeds > 1) {
            return " s počtem postelí: "+this.numBeds;
        }
        return " bez postelí";
    }

    public int getNumRoom() {
        return numRoom;
    }

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
