/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jsu.mcis.cs310;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Aitor
 */
public class MainTest {
    
    private Main main;
    private String expected;
    
    @Before
    public void setUp() {
        main = new Main();
        expected = "Hello, World!";
    }
    
    @Test
    public void testGreeting() {
        String actual = main.getGreeting();
        assertEquals(expected, actual);
    } 
    
    @Test
    public void testReverseCustom() {
        String input = "JUnit";
        String expected = "tinUJ";
        String actual = main.reverse(input);
        assertEquals(expected, actual);
        System.out.println("Actual result: " + actual);
    }

}
