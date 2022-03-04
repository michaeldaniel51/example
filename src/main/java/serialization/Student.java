package serialization;

import java.io.Serializable;

public class Student implements Serializable {


    private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    transient int x;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return ("Student id is: " + this.getId()
                + ", name is : " + this.getName());
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
    }
}
