package cz.vsb.ekf.urm0009;

public class Teacher {
    private String name;
    private String surname;

    public String printInformation(){
        return "Třídní učitel: " + surname + ", " + name;
    }

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

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
}
