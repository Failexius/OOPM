package CodeReview_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Department in a University.
 * Demonstrates 1:n relation (Department has many Students).
 * Covers MLEO_05_03.
 */
public class Department {
    private String name;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department: " + name + " (Students: " + students.size() + ")";
    }
}
