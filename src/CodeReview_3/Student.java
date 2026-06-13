package CodeReview_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Student.
 * Demonstrates n:m relation (Students have many Courses).
 * Covers MLEO_05_04.
 */
public class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enroll(Course course) throws EnrollmentException {
        if (course == null) {
            // MLEO_06_03: throw new exception
            throw new EnrollmentException("Course cannot be null.");
        }
        if (enrolledCourses.contains(course)) {
            throw new EnrollmentException("Student is already enrolled in this course.");
        }
        enrolledCourses.add(course);
        // Ensure bidirectional n:m relation
        if (!course.getStudents().contains(this)) {
            course.addStudent(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}
