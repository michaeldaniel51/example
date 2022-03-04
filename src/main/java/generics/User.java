package generics;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

        List<User> e = new ArrayList<>();
        e.add(new User(1,"gad"));
        e.add(new User(2,"sam"));

        System.out.println(e);

        User u = new User();
        u.setId(1);
        u.setName("hon");
        User s = new User();
        s.setName("dan");
        s.setId(3);

        System.out.println(Arrays.asList(u.getName(),s.getName(),u.getId()));
        System.out.println(s);




    }


}
