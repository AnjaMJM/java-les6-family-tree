import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private String middleName;
    private final String lastName;
    private final int age;
    private final String sex;
    private Person mother;
    private Person father;
    private Person partner;
    List<Person> siblings = new ArrayList<>();
    List<Person> children = new ArrayList<>();
    List<Pet> pets = new ArrayList<>();

    //Constructors
    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    //Methods
    public Person getMotherFor(int generations) {
        if (generations == 1) {
            return mother;
        }
        return mother.getMotherFor(generations - 1);
    }

    public String getFullName() {
        return (this.getName() + " " + this.getLastName());
    }

    public List<Person> findGrandChildren() {
        List<Person> grandchildren = new ArrayList<>();
        // enhanced for-loop of for/each --> neem 1 item : uit deze lijst
        for (Person child : this.children) {
            grandchildren.addAll(child.children);
            // is hetzelfde als: for (Person grandchild : child.children) {
            //                grandchildren.add(grandchild);
        }
        return grandchildren;
    }

    // Getters, setters and adders
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
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

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public Person getSibling(int i) {
        return siblings.get(i);
    }

    public void addPartner(Person partner) {
        this.partner = partner;
    }

    public Person getPartner() {
        return partner;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
