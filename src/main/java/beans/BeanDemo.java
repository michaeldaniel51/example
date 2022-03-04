package beans;

import java.io.Serializable;

public class BeanDemo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age ;
    private String Address;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    @Override
    public String toString() {
        return "BeanDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }
}
