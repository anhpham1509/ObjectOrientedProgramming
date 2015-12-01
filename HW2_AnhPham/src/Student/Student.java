package Student;

import java.util.Formatter;

/**
 * Created by DuyAnhPham on 05/09/15.
 */
public class Student {

    private long studentNumber;

    private String firstName;
    private String lastName;

    public Student(){
        this(0,"Test","Test");
    }

    public Student(long number, String firstName, String lastName){
        this.setStudentNumber(number);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        Formatter fmt = new Formatter();
        String s = fmt.format("Student Number: %d First Name: %s Last Name: %s",
                this.getStudentNumber(),
                this.getFirstName(),
                this.getLastName()).toString();
        return s;
    }

}
