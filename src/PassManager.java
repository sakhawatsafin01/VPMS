import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PassManager {

    int newPassID = 1000;

    int generatePassID() {
        return newPassID++;
    }

    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

    void enterVisitor(int id) {
        for (int i = 0; i < passesList.size(); i++) {
            if (passesList.get(i).passID == id) {

                passesList.get(i).entryTime = LocalTime.now().format(myFormat);
                passesList.get(i).status = "Active";

                System.out.println("Visitor Entered.");

                return;

            }
        }
        System.out.println("Pass not found; entry restricted!");
    }

    void exitVisitor(int id) {
        for (int i = 0; i < passesList.size(); i++) {
            if (passesList.get(i).passID == id) {

                passesList.get(i).exitTime = LocalTime.now().format(myFormat);
                passesList.get(i).status = "Extited";

                System.out.println("Visitor Exited.");

                return;

            }
        }
        System.out.println("Pass not found; entry restricted!");
    }

    ArrayList<Pass> passesList = new ArrayList<>();

    void addPass(Pass pass) {
        passesList.add(pass);
        System.out.println("\nPass added succesfully!\n");

    }

    public void showPassList() {

        System.out.println("\n----- List of Passes -----");

        for (int i = 0; i < passesList.size(); i++) {

            System.out.println("Pass ID: " + passesList.get(i).passID);
            System.out.println("Visitor: " + passesList.get(i).visitor.visitorName);
            System.out.println("Student: " + passesList.get(i).student.studentName);
            System.out.println("Visitor's Status: " + passesList.get(i).status);
            System.out.println("Visitor's Entry Time: " + passesList.get(i).entryTime);
            System.out.println("Visitor's Exit Time: " + passesList.get(i).exitTime);


            System.out.println("--------------------");

        }

    }

    void showActiveVisitors() {
        for (int i = 0; i < passesList.size(); i++) {
            if (passesList.get(i).status.equals("Active")) {
                System.out.println("\nPass ID: " + passesList.get(i).passID);
                System.out.println("Visitor: " + passesList.get(i).visitor.visitorName);
                System.out.println("Student: " + passesList.get(i).student.studentName);
                System.out.println("Student ID: " + passesList.get(i).student.studentID);
                System.out.println("Entry Time: " + passesList.get(i).entryTime);
            }
        }
    }
}