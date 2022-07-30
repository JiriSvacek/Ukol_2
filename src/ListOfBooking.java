import java.util.ArrayList;

public class ListOfBooking {
    private ArrayList<Booking> listOfBooking = new ArrayList<>();


    public void addBooking(Booking booking) {
        listOfBooking.add(booking);
    }

    public void seeBooking() {
        System.out.println("Seznam rezervací: ");
        for (Booking booking: listOfBooking) {
            System.out.println(booking.getDescription());
        }
        System.out.println("---------------");
    }




}
