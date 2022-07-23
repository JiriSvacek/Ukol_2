import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        Room pokoj1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room pokoj2 = new Room(2,1,true,true, BigDecimal.valueOf(1000));
        Room pokoj3 = new Room(3,3,false,true, BigDecimal.valueOf(2400));

        System.out.println(pokoj1.getDescription());
        System.out.println(pokoj2.getDescription());
        System.out.println(pokoj3.getDescription());

        Booking rezervace1 = new Booking(pokoj1,LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),false,adela);
        Booking rezervace2 = new Booking(pokoj1,LocalDate.of(2021,9,3),
                LocalDate.of(2021,9,14),false,adela,jan);



        ListOfBooking seznam = new ListOfBooking();
        seznam.addBooking(rezervace1);
        seznam.addBooking(rezervace2);

        seznam.seeBooking();
    }
}