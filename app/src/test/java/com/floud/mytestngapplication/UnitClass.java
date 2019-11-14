package com.floud.mytestngapplication;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


public class UnitClass {


    @BeforeSuite
    public void setUp() {
        System.out.println("BeforeSuite call");
    }

    @Test
    public void multiplyIsCorrect() {
        assertEquals(6, 2 * 3);
    }

    @Test
    public void divideIsCorrect(){
        assertEquals(9, 18 / 2);
    }

    @Test
    public void StringIsIncorrect() {
        assertNotEquals("Wrong", "Worng");
    }

    @Parameters("lastName")
    @Test
    public void lastNameTestCorrect(String lastName){
        System.out.println("LastName parametr is: " + lastName);
        assertEquals("Khalturin",lastName);
    }


    @AfterSuite
    public void TearDown() {
        System.out.println("After suite call");
    }
}