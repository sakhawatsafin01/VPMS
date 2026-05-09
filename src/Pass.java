public class Pass {

    int passID;

    //creating variables to hold objects
    Student student;
    Visitor visitor;

    String entryTime;
    String exitTime;
    String status;

    public Pass(int passID, Student student, Visitor visitor, String status) {
        this.passID = passID;
        this.student = student;
        this.visitor = visitor;
        this.status = status;
    }
}
