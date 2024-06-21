public class Main {
    public static void main(String[] args) {
        Person mirabel = new Person("Mirabel", "Madrigal", 15, "female");
        Person julieta = new Person ("Julieta", "Madrigal", 40, "female");
        Person abuela = new Person("Alma", "Abuela", "Madrigal", 72, "female");
        Person Isabela = new Person ("Isabela", "Madrigal", 21, "female");

        julieta.setMother(abuela);
        mirabel.setMother(julieta);

        System.out.println(mirabel.getMotherFor(2).getFullName());

    }

}
