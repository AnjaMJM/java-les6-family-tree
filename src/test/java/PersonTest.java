import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;
    @BeforeEach
    void setUp() {
    person = new Person ("Mirabel", "Madrigal", 15, "female");
    }

    @Test
    void canHaveParents() {
        //arrange

        var mother = new Person ("Julieta", "Madrigal",42, "female");
        var father = new Person ("Agustin", "Madrigal",45, "male");
        //act
        person.addParents(mother, father);
        //assert
        assertEquals(person.getFather(), father);
        assertEquals(person.getMother(), mother);

    }

    @Test
    void canGetPersonInfo() {
        //arrange
//        var person = new Person ("Abuela", 70, "female");
        //assert
        assertEquals(person.getName(), "Mirabel");
        assertEquals(person.getLastName(), "Madrigal");
        assertEquals(person.getAge(), 15);
        assertEquals(person.getSex(), "female");
    }


    @Test
    void canHaveSiblings() {
        //arrange
        var sibling1 = new Person ("Isabela", "Madrigal", 20, "female");
        var sibling2 = new Person ("Luisa", "Madrigal", 18, "female");
        List<Person> siblings = Arrays.asList(sibling1, sibling2);
        //act
        person.addSibling(sibling1);
        person.addSibling(sibling2);
        //assert
        assertEquals(siblings, person.getSiblings());
    }

    @Test
    void canGetSingleSibling() {
        //Arrange
        var sibling1 = new Person("Isabela", "Madrigal", 20, "female");
        var sibling2 = new Person("Luisa", "Madrigal", 18, "female");
        List<Person> siblings = Arrays.asList(sibling1, sibling2);
        person.addSibling(sibling1);
        person.addSibling(sibling2);
        //Act
        //Assert
        assertEquals(siblings.get(0), person.getSibling(0));
    }

    @Test
    void canHaveChildren() {
        //assert
        var child1 = new Person("Dolores", "Eavesdropper", "Madrigal", 19, "female");
        var child2 = new Person("Luisa", "Madrigal", 18, "female");
        List<Person> children = Arrays.asList(child1, child2);
        //act
        person.addChild(child1);
        person.addChild(child2);
        //assert
        assertEquals(children, person.getChildren());
    }

    @Test
    void getPets() {
        //arrange
        var dog = new Pet("Froufrou", "male", 2, "dog");
        List<Pet> pets = Arrays.asList(dog);
        //act
        person.addPet(dog);
        //assert
        assertEquals(pets, person.getPets());
    }

    @Test
    void canHavePartner() {
        //arrange
        var partner = new Person("Miguel", "coco","Rivera", 17, "male");
        //act
        person.addPartner(partner);
        //assert
        assertEquals(partner, person.getPartner());
    }

    @Test
    public void canCheckGreatGrandMother() {
        // Arrange
        var mother = new Person("Julieta", "Madrigal",42, "female");
        var grandMother = new Person("Alma", "Abuela", "Madrigal", 70, "female");
        var greatGrandMother = new Person("Pepita", "Madrigal", 100, "female");
        // Act
        grandMother.setMother(greatGrandMother);
        mother.setMother(grandMother);
        person.setMother(mother);
        // Assert
        assertEquals(person.getMotherFor(3),greatGrandMother);
    }

    @Test
    void canFindGrandchildren() {
        //arrange
        var grandMother = new Person("Alma", "Abuela", "Madrigal",
                70, "female");
        var mother = new Person("Julieta", "Madrigal",42, "female");
        var sister = new Person("Pepita", "Madrigal", 100, "female");
        grandMother.addChild(mother);
        mother.addChild(person);
        mother.addChild(sister);
        List<Person> grandChildren = Arrays.asList(person, sister);
        //act
        grandMother.findGrandChildren();
        //assert
        assertEquals(grandChildren, grandMother.findGrandChildren());
    }
}
