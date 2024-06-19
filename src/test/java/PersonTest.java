import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

//    @BeforeEach
//    void setUp() {
//    Person person = new Person("Abuela", 82, "Female");
//    }

    @Test
    void canGetParents() {
        //arrange
        var person = new Person ("Mirabel", 15, "female");
        var mother = new Person ("Julieta", 42, "female");
        var father = new Person ("Agustin", 45, "male");
        //act
        person.addParents(mother, father);
        //assert
        assertEquals(person.getFather(), father);
        assertEquals(person.getMother(), mother);

    }

    @Test
    void canGetPersonInfo() {
        //arrange
        var person = new Person ("Abuela", 70, "female");
        //act

        //assert
    }

    @Test
    void getAge() {
    }

    @Test
    void getSex() {
    }

    @Test
    void getMother() {
    }

    @Test
    void getFather() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void getChildren() {
    }

    @Test
    void getPets() {
    }
}