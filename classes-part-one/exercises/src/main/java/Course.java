import java.util.ArrayList;

public class Course {
    private String subject;
    private String instructor;
    private ArrayList<Student> enrolledStudents;
    public Course(String subject, String instructor, ArrayList<Student> enrolledStudents){
        this.subject = subject;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
