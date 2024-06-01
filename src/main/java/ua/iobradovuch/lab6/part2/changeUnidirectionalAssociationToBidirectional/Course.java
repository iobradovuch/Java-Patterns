package ua.iobradovuch.lab6.part2.changeUnidirectionalAssociationToBidirectional;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Додаткові методи...
}