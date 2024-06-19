public class Pet {
    private String name;
    private final String sex;
    private final int age;
    private final String species;
    private Person owner;

    Pet(String name, String sex, int age, String species){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.species=species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
