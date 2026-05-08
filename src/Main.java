public class Main {
    static void main(String[] args) {

        Student s1 = new Student();

        s1.studentID = "2025-2-60-007";
        s1.studentName = "Safin";

        Visitor v1 = new Visitor();

        v1.visitorName = "Noureen";
        v1.Relation = "Friend";
        v1.Purpose = "Campus Visit";

        Pass p1 = new Pass();

        p1.passID = 14082004;
        p1.student = s1;
        p1.visitor = v1;
        p1.status="Pending";

        System.out.println("Student Name: " + p1.student.studentName);
        System.out.println("Visitor Name: " + p1.visitor.visitorName);

    }
}
