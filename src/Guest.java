import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate born;

    public Guest(String name, String surname, LocalDate born) {
        this.name = name;
        this.surname = surname;
        this.born = born;
    }

    public String getDescription() { return "Host: "+name+" "+surname+" Narozen: "+born; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }
}
