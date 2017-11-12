package Sort;

import java.io.Serializable;

/**
 * Created by user on 10/30/2017.
 */
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String lastName;
    private int age;


    public Students(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId(){
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return  "{" +
                "\n\tId: " + this.id + ";" +
                "\n\tName: " + this.name + ";" +
                "\n\tLast Name: " + this.lastName + ";" +
                "\n\tAge: " + this.age + ";" +
                "\n}";
    }

}
