package cz.vsb.ekf.urm0009;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass("4.C", 4);
        schoolClass.addStudent(new Student("Petr", "Svoboda", LocalDateTime.of(2011, 2, 10, 9, 50), "ID001"));
        schoolClass.addStudent(new Student("Milan", "Říha", LocalDateTime.of(2010, 2, 10, 9, 50), "ID123"));
        schoolClass.addStudent(new Student("Jindřich", "Nový", LocalDateTime.of(2012, 2, 10, 9, 50), "ID345"));
        schoolClass.setTeacher(new Teacher("Jan", "Novák"));
        System.out.println(schoolClass);
        System.out.println(schoolClass.toString(1));
        schoolClass.uploadFile(schoolClass.toString("a"));
    }
}
