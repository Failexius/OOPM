# Design Analysis: University Management System
This document addresses MLEO_11_01 through MLEO_11_04.

## Problem Statement
The system manages student enrollments in courses. A user needs to be able to create students, enroll them in specific courses, and export the resulting data to a file. The system must handle errors such as duplicate enrollments.

## 1. Actors (MLEO_11_01)
- **User (Primary Actor):** The person interacting with the `Main` class to trigger system actions.
- **File System (Secondary Actor):** The external entity that stores the exported student data.

## 2. Messages and Message Types (MLEO_11_02)
- **Synchronous Messages:**
    - `enroll(Course)`: Sent from `Main` (via `Student`) to process an enrollment.
    - `addStudent(Student)`: Sent from `Student` to `Course` to maintain bidirectional relation.
- **Return Messages:**
    - Confirmation of success or an `EnrollmentException` if the process fails.
- **Self-Messages:**
    - `sortByName()`: Internal logic within `MyContainer`.

## 3. Lifelines and Activations (MLEO_11_03)
- **Main:** The entry point that orchestrates the objects. It stays active throughout the execution.
- **Student (s1, s2):** Becomes active when `enroll()` is called.
- **Course (javaCourse):** Becomes active when `addStudent()` is called by a Student.
- **DataHandler:** Becomes active during the static call to `exportStudents()`.

## 4. Fragments and Fragment Types (MLEO_11_04)
- **alt (Alternatives):** Used for the `try-catch` block. 
    - Case 1: Enrollment succeeds.
    - Case 2: `EnrollmentException` is caught and an error is displayed.
- **loop (Iteration):** Used in `DataHandler.exportStudents()` to iterate over the list of students.
- **opt (Optional):** Used when checking if a student is already in a course before adding them.
