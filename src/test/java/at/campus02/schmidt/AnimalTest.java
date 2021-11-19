package at.campus02.schmidt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal säugetier;


    @BeforeEach
    void setUp() {
        säugetier = new Animal("Löwe", "Säugetier", "roar", 1);

    }

    @Test
    void giveAnimalLoud () {

    String tierlaut = säugetier.giveAnimalLoud();
    assertEquals(tierlaut, "roar");



    }

    @Test
    void getNameAndAge () {
        String nameUndAlter = säugetier.getNameAndAge();
        assertEquals(nameUndAlter, "Das Tier heißt Löwe und ist 1 alt");

    }

    @Test
    void ageCategory() {
        String altersKategorie = säugetier.ageCategory();
        assertEquals(altersKategorie, "baby animal");

    }
}