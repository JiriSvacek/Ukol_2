import java.util.ArrayList;

public class ListOfBooking {
    ArrayList<Booking> listOfBooking = new ArrayList<>();


    public void addBooking(Booking booking) {
        this.listOfBooking.add(booking);
    }

    public void seeBooking(){
        System.out.println("Seznam rezervací: ");
        for (Booking booking: this.listOfBooking) {
            System.out.println(booking.getDescription());
        }
        System.out.println("---------------");
    }




}
