package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void containsCityTest(){
        City testcity = new City("Edmonton","Alberta");
        list.addCity(testcity);
        assertTrue(list.hasCity(testcity));
    }

    @Test
    public void deleteCityTest(){
        City testcity = new City("Edmonton","Alberta");
        list.addCity(testcity);
        assertTrue(list.hasCity(testcity));
        list.deleteCity(testcity);
        assertFalse(list.hasCity(testcity));
    }

    @Test
    public void countCityTest(){
        assertEquals(0,list.countCities());
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(1,list.countCities());
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(2,list.countCities());

    }

}
