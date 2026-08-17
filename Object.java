using Object reference:

import java.util.HashMap;

class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(
            rollNo + "  " + name + "  " + marks
        );
    }
}

class Test19 {

    static HashMap<Integer, Student> students = new HashMap<>();

    // Add Student
    static void addStudent(Student s) {
        students.put(s.rollNo, s);
        System.out.println("Student added.");
    }

    // Search Student
    static void searchStudent(int rollNo) {

        if (students.containsKey(rollNo)) {

            Student s = students.get(rollNo);

            System.out.println("Student Found:");
            s.display();

        } else {
            System.out.println("Student not found.");
        }
    }

    // Update Student
    static void updateStudent(int rollNo, String name, int marks) {

        if (students.containsKey(rollNo)) {

            Student s = students.get(rollNo);

            s.name = name;
            s.marks = marks;

            System.out.println("Student updated.");

        } else {
            System.out.println("Student not found.");
        }
    }

    // Remove Student
    static void removeStudent(int rollNo) {

        if (students.containsKey(rollNo)) {

            students.remove(rollNo);

            System.out.println("Student removed.");

        } else {
            System.out.println("Student not found.");
        }
    }

    // Display Students
    static void displayStudents() {

        System.out.println("RollNo  Name  Marks");

        for (Integer rollNo : students.keySet()) {

            Student s = students.get(rollNo);

            s.display();
        }
    }

    public static void main(String[] args) {

        // Add students

        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(102, "Amit", 90);
        Student s3 = new Student(103, "Priya", 95);

        addStudent(s1);
        addStudent(s2);
        addStudent(s3);

        System.out.println();

        // Display
        displayStudents();

        System.out.println();

        // Search
        searchStudent(102);

        System.out.println();

        // Update
        updateStudent(102, "Rohit", 92);

        System.out.println();

        // Display after update
        displayStudents();

        System.out.println();

        // Remove
        removeStudent(103);

        System.out.println();

        // Display after remove
        displayStudents();
    }
}