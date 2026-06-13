package CodeReview_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Course.
 * Demonstrates n:m relation (Courses have many Students).
 * Covers MLEO_05_04.
 */
public class Course {
    private String title;
    private String courseCode;
    private List<Student> students;

    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        this.students = new ArrayList<>();
    }

    protected void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course[" + courseCode + ": " + title + "]";
    }
}
