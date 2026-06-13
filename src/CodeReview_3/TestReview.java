package CodeReview_3;

/**
 * Demonstrates Unit Testing (Manual/Conceptual).
 * Covers MLEO_08_01, 08_02.
 */
public class TestReview {
    static void main(String[] args) {
        System.out.println("--- Running Unit Tests ---");
        
        testStudentEnrollment();
        testContainerSorting();
        
        System.out.println("--- All Tests Finished ---");
    }

    /**
     * MLEO_08_01: Test for a single method (enroll).
     */
    static void testStudentEnrollment() {
        System.out.print("Test Student Enrollment: ");
        Student s = new Student(1, "Test");
        Course c = new Course("T1", "Test Course");
        try {
            s.enroll(c);
            if (s.getEnrolledCourses().contains(c) && c.getStudents().contains(s)) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED (Bidirectional relation mismatch)");
            }
        } catch (EnrollmentException e) {
            System.out.println("FAILED (Unexpected exception: " + e.getMessage() + ")");
        }
    }

    /**
     * MLEO_08_02: Unit test for another functionality (Sorting).
     */
    static void testContainerSorting() {
        System.out.print("Test Container Sorting: ");
        MyContainer mc = new MyContainer();
        mc.add(new Student(2, "Zebra"));
        mc.add(new Student(1, "Alpha"));
        
        mc.sortByName();
        
        if (mc.get(0).getName().equals("Alpha") && mc.get(1).getName().equals("Zebra")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED (Incorrect order)");
        }
    }
}
