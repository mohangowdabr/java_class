// Practicum No. 2 - Inheritance
// University Student Management using Inheritance concept

class Student {
    String studentId;
    String studentName;
    String department;

    Student(String studentId, String studentName, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    // Displays the common student information
    void displayStudentDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + (studentName.isEmpty() ? "(empty)" : studentName));
        System.out.println("Department   : " + department);
    }
}

// Sub class that extends Student
class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    UndergraduateStudent(String studentId, String studentName, String department,
                          int semester, double cgpa) {
        super(studentId, studentName, department);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    // Displays undergraduate-specific information
    void displayUGDetails() {
        System.out.println("Semester     : " + semester
                + (semester < 1 || semester > 8 ? "  (out of valid range 1-8)" : ""));
        System.out.println("CGPA         : " + cgpa
                + (cgpa < 0 || cgpa > 10 ? "  (out of valid range 0-10)" : ""));
    }
}

// Sub class that extends Student
class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostgraduateStudent(String studentId, String studentName, String department,
                         String specialization, String researchTopic) {
        super(studentId, studentName, department);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    // Displays postgraduate-specific information
    void displayPGDetails() {
        System.out.println("Specialization : " + specialization);
        System.out.println("Research Topic : " + (researchTopic.isEmpty() ? "(empty)" : researchTopic));
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        UndergraduateStudent ug1 = new UndergraduateStudent("101", "Ravi", "CSE", 5, 8.75);
        ug1.displayStudentDetails();
        ug1.displayUGDetails();

        System.out.println();
        PostgraduateStudent pg1 = new PostgraduateStudent("201", "Anita", "ECE", "AI", "Computer Vision");
        pg1.displayStudentDetails();
        pg1.displayPGDetails();

        System.out.println();
        UndergraduateStudent ug2 = new UndergraduateStudent("102", "Kiran", "ISE", 3, 7.5);
        ug2.displayStudentDetails();

        System.out.println();
        UndergraduateStudent ug3 = new UndergraduateStudent("103", "Sneha", "CSE", 7, 9.10);
        ug3.displayUGDetails();

        System.out.println();
        PostgraduateStudent pg2 = new PostgraduateStudent("202", "Rahul", "CSE", "Data Science", "NLP");
        pg2.displayPGDetails();

        System.out.println();
        UndergraduateStudent ug4 = new UndergraduateStudent("-10", "Test", "CSE", 4, 8.0);
        ug4.displayStudentDetails();

        System.out.println();
        UndergraduateStudent ug5 = new UndergraduateStudent("104", "", "CSE", 4, 8.0);
        ug5.displayStudentDetails();

        System.out.println();
        UndergraduateStudent ug6 = new UndergraduateStudent("105", "Divya", "CSE", 10, 8.0);
        ug6.displayUGDetails();

        System.out.println();
        UndergraduateStudent ug7 = new UndergraduateStudent("106", "Arjun", "CSE", 5, 11.5);
        ug7.displayUGDetails();

        System.out.println();
        PostgraduateStudent pg3 = new PostgraduateStudent("203", "Neha", "ECE", "VLSI", "");
        pg3.displayPGDetails();
    }
}