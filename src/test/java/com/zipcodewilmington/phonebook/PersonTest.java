package com.zipcodewilmington.phonebook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class PersonTest {


    @Test
    public void testNewPerson(){
        Person bobby = new Person("Bobby", "867-5309");
        String expectedNumber = "867-5309";
        String expectedName = "Bobby";
        String actual = bobby.printName() + bobby.printNumbers();
        Assert.assertTrue(actual.contains(expectedName) && actual.contains(expectedNumber));
    }

    @Test
    public void testAddNumber(){
        Person bobby = new Person("Bobby", "867-5309");
        String expectedNumber = "117-2490";
        bobby.addNumber(expectedNumber);
        String actual = bobby.printNumbers();
        Assert.assertTrue(actual.contains(expectedNumber));
    }


}