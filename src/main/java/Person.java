import java.sql.Array;
import java.util.ArrayList;

public class Person {
    private final String name;
    private final int age;
    private final String sex;
    private Person mother;
    private Person father;
    ArrayList<Person> siblings;
    ArrayList<Person> children;
    ArrayList<Pet> pets;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

}
