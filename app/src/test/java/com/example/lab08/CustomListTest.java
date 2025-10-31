package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() throws Exception{
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);

        assertTrue(list.hasCity(vancouver));

        list.deleteCity(vancouver);
        assertFalse(list.hasCity(vancouver));
    }

    @Test
    public void testCitiesCount(){
        CustomList list = new CustomList();
        City burnaby = new City("Burnaby", "BC");
        list.addCity(burnaby);

        City coquitlam = new City("Coquitlam", "BC");

        assertTrue(list.hasCity(burnaby));

        assertTrue(countCities(list) == 2);
    }
}
