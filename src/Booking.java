import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Booking {
    private ArrayList<Guest> listOfGuest = new ArrayList<>();
    private Room room;
    private LocalDate beginning, end;
    private boolean isBusiness;

    public Booking(Room room, LocalDate beginning, LocalDate end, boolean isBusiness, Guest... guests) {
        if (isEmpty(guests)) {
            throw new NullPointerException("Je potřeba zadat minimálně jednoho hosta");
        } else {
            this.listOfGuest.addAll(Arrays.asList(Objects.requireNonNull(guests)));
            this.room = room;
            this.beginning = beginning;
            this.end = end;
            this.isBusiness = isBusiness;
        }
    }

    private boolean isEmpty(Guest... guests) { return guests.length == 0; }
    public String getDescription() {
        return "Rezervace: "+this.room.getDescription()+"OD: "+this.getBeginning()+
                " DO: "+this.getEnd()+this.getStringBusiness()+" Rezervace pro:"+getStringGuests();
    }

    private String getStringBusiness() {
        return isBusiness ? " , důvodem je pracovní cesta. ": ", důvodem není pracovní cesta.";
    }

    private String getStringGuests() {
        String seznam = " ";
        for (Guest guest: this.listOfGuest) {
            seznam += guest.getName()+" "+guest.getSurname()+" ";
        }
        return seznam;
    }

    public ArrayList<Guest> getListOfGuest() {
        return this.listOfGuest;
    }

    public void setListOfGuest(ArrayList<Guest> listOfGuest) {
        this.listOfGuest = listOfGuest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalDate beginning) {
        this.beginning = beginning;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }
}
