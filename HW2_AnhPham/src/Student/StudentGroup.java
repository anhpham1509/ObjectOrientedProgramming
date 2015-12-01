package Student;

import java.util.Formatter;
import java.util.List;

/**
 * Created by DuyAnhPham on 05/09/15.
 */
public class StudentGroup {

    private long groupCode;
    private Student contactStudent = new Student();

    private List<Student> studentList;

    public StudentGroup(long groupCode, Student contactStudent, List<Student> studentList){
        this.setGroupCode(groupCode);
        this.setContactStudent(contactStudent);
        this.setStudentList(studentList);
        this.addStudent(this.contactStudent);
    }

    public long getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(long groupCode) {
        this.groupCode = groupCode;
    }

    public Student getContactStudent() {
        return contactStudent;
    }

    public void setContactStudent(Student contactStudent) {
        this.contactStudent = contactStudent;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void getInfo(){
        System.out.printf("Student Group %d\n\t Contact Student: %s\n",
                this.groupCode,
                this.contactStudent);
        System.out.println("Student list:");
        for (Student s:studentList){
            System.out.println(s);
        }
    }

    public void addStudent(Student newStudent){
        this.studentList.add(newStudent);
    }
}
