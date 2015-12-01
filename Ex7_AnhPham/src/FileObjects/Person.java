package FileObjects;

import java.io.Serializable;
import java.util.Formatter;

/**
 * Created by DuyAnhPham on 21/09/15.
 */
public class Person implements Serializable{
    public String name;

    public int age;

    public Person(String name, int age) { // constructor
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        Formatter fmt = new Formatter();
        String s = fmt.format("Name: %s. Age: %d", this.getName(), this.getAge()).toString();
        return s;
    }
}
