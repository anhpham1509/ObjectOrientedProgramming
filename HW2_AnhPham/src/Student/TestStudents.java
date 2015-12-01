package Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 05/09/15.
 */
public class TestStudents {

    public static void main (String[] arg){
        //Create 3 students and print their properties

        Student student1 = new Student();
        Student student2 = new Student(12345,"Anh","Pham");
        Student student3 = new Student(27485,"New","Student");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        //Test Student Group
        long groupCode = 123456;
        Student contactStudent = new Student(987654,"HyHy","Phan");
        List<Student> studentList = new ArrayList<>();

        StudentGroup newGroup = new StudentGroup(groupCode, contactStudent, studentList);
        newGroup.getInfo();
        newGroup.addStudent(student2);
        newGroup.addStudent(student3);
        newGroup.getInfo();
    }
}
