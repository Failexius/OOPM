package CodeReview_3;

import java.io.IOException;
import java.util.List;

public class Main {
    static void main(String[] args) {
        System.out.println("--- CodeReview_3 Demo ---");

        // 1. Relations (1:n and n:m)
        Department itDept = new Department("IT Services");
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");

        itDept.addStudent(s1);
        itDept.addStudent(s2);
        itDept.addStudent(s3);
        System.out.println(itDept);

        Course javaCourse = new Course("CS101", "Java Programming");
        Course dbCourse = new Course("CS202", "Database Systems");

        try {
            s1.enroll(javaCourse);
            s1.enroll(dbCourse);
            s2.enroll(javaCourse);
            // MLEO_06_03: Triggering custom exception
            // s1.enroll(javaCourse); 
        } catch (EnrollmentException e) {
            System.err.println("Enrollment Error: " + e.getMessage());
        }

        System.out.println("Students in Java: " + javaCourse.getStudents().size());

        // 2. Custom Container & Streams/Lambdas (MLEO_05_05, 05_06)
        MyContainer container = new MyContainer();
        container.add(s1);
        container.add(s2);
        container.add(s3);

        System.out.println("\nSorting students by name...");
        container.sortByName();
        container.getAll().forEach(s -> System.out.println(s));

        System.out.println("\nFiltering students with ID > 101...");
        List<Student> filtered = container.filter(s -> s.getId() > 101);
        filtered.forEach(System.out::println);

        // 3. File I/O (MLEO_07_01, 07_02)
        String exportFile = "src/CodeReview_3/students_export.csv";
        System.out.println("\nExporting students to " + exportFile);
        DataHandler.exportStudents(container.getAll(), exportFile);

        try {
            System.out.println("Importing students from " + exportFile);
            List<Student> imported = DataHandler.importStudents(exportFile);
            System.out.println("Imported " + imported.size() + " students.");
        } catch (IOException e) {
            System.err.println("Import failed: " + e.getMessage());
        }

        System.out.println("\n--- End of Demo ---");
    }
}
