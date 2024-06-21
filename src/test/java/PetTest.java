import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    //Eerst object aanmaken van class, ivm scope van de setUp
    private Pet dog;

    @BeforeEach
    void setUp() {
        dog = new Pet("Doogie", "male", 3, "Labradoodle");
    }

    @Test
    void canGetPetInfo() {
        //arrange: setUp
        //assert
        assertEquals(dog.getName(), "Doogie");
        assertEquals(dog.getSex(), "male");
        assertEquals(dog.getAge(), 3);
        assertEquals(dog.getSpecies(), "Labradoodle");
    }

    @Test
    void canSetAndGetOwner() {
        //Arrange
        Person owner = new Person ("Mirabel", "Madrigal",15, "female");
        //Act
        dog.setOwner(owner);
        //Assert
        assertEquals(owner, dog.getOwner());
    }

    @Test
    void canChangeName() {
        //Arrange:
        String newName = "Bumble";
        //Act
        dog.setName(newName);
        //Assert
        assertEquals(newName, dog.getName());
    }

    @Test
    void canAgePetOneYear() {
        //Arrange
        int newAge = dog.getAge() + 1;
        //Act
        dog.increaseAgePetOneYear();
        //Assert
        assertEquals(newAge, dog.getAge());
    }
}