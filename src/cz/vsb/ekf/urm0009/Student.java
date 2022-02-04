package cz.vsb.ekf.urm0009;

import java.time.LocalDateTime;

public class Student extends Teacher{
    private LocalDateTime birthday;
    private String ID;

    public Student(String name, String surname, LocalDateTime birthday, String ID) {
        super(name, surname);
        this.birthday = birthday;
        this.ID = ID;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String printInformation() {
        return ID + " - " + getName() + getSurname() + " (" + birthday.getYear() + ")";
    }
}
