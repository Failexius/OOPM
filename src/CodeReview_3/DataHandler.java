package CodeReview_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles data import and export.
 * Covers MLEO_07_01 (Export) and MLEO_07_02 (Import).
 */
public class DataHandler {

    /**
     * Exports a list of students to a text file.
     * MLEO_07_01
     */
    public static void exportStudents(List<Student> students, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("ID;Name");
            writer.newLine();
            for (Student s : students) {
                writer.write(s.getId() + ";" + s.getName());
                writer.newLine();
            }
        } catch (IOException e) {
            // MLEO_06_04: handle exception
            System.err.println("Error during export: " + e.getMessage());
        }
    }

    /**
     * Imports students from a CSV file.
     * MLEO_07_02
     */
    public static List<Student> importStudents(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine(); // skip header
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    students.add(new Student(id, name));
                }
            }
        }
        return students;
    }
}
