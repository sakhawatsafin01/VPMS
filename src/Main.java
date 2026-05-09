import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static PassManager manager = new PassManager();
    static void main(String[] args) {

        while (true) {

            System.out.println("\n========== Visitor Pass Management System ==========\n");

            System.out.println("1. Request Pass");
            System.out.println("2. Show All Passes");
            System.out.println("3. Enter Visitor");
            System.out.println("4. Exit Visitor");
            System.out.println("5. Show Active Visitors");
            System.out.println("6. Exit");

            System.out.print("\nPlease enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            System.out.println("\n");

            if (choice == 1) {
                createNewPass();

            } else if (choice == 2) {
                manager.showPassList();

            } else if (choice == 3) {

                System.out.print("Enter Pass ID: ");
                int id = input.nextInt();
                manager.enterVisitor(id);

            } else if (choice == 4) {

                System.out.print("Enter Pass ID: ");
                int id = input.nextInt();
                manager.exitVisitor(id);

            } else if (choice == 5) {
                manager.showActiveVisitors();

            } else if (choice == 6) {
                System.out.println("System Closed");
                break;

            } else {
                System.out.println("Entered choice is invalid!");

            }

        }

    }
    static void createNewPass() {

        //Using constructor inputing std infos
        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        Student newStudent = new Student(studentID, studentName);

        //Using constructor inputing visitor infos
        System.out.print("Enter Visitor Name: ");
        String visitorName = input.nextLine();

        System.out.print("Enter The Relationship: ");
        String Relation = input.nextLine();

        System.out.print("Enter Visitor's Purpose: ");
        String Purpose = input.nextLine();

        Visitor newVisitor = new Visitor(visitorName, Relation, Purpose);

        //Using constructor inputing pass infos
        Pass newPass = new Pass(manager.generatePassID(), newStudent, newVisitor, "Pending");

        manager.addPass(newPass);
    }
}
