/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jsu.mcis.cs310;

/**
 *
 * @author Aitor
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.getGreeting());
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

}