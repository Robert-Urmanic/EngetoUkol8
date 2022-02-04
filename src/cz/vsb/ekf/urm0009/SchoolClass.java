package cz.vsb.ekf.urm0009;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private String name;
    private Integer grade;
    private Teacher teacher;
    private List<Student> listOfStudents = new ArrayList<>();

    public SchoolClass(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

    @Override
    public String toString() {
        String temp = "####################################\n" + "Třída: " + name + " (ročník: " + grade + ")\n" +
                teacher.printInformation() + "\nPočet studentů: " + listOfStudents.size() + "\n\n####################################\n";
        for (Student tempS : listOfStudents) {
            int counter = 1;
            temp += "# " + counter + " # " + tempS.printInformation() + "\n";
        }
        return temp;
    }

    public String toString(int a) {
        String temp = name + ", " + teacher.getName() + " " + teacher.getSurname() + "\n";
        for (Student tempS : listOfStudents) {
            temp += tempS.getID() + ", " + tempS.getName() + " " + tempS.getSurname() + "\n";
        }
        return temp;
    }

    public String toString(String s) {
        String temp = teacher.printInformation() + "\n";
        for (Student tempS : listOfStudents) {
            temp += tempS.printInformation() + "\n";
        }
        return temp;
    }

    public void uploadFile(String string) {
        try (PrintWriter out = new PrintWriter("vystup.txt")) {
            out.println(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
