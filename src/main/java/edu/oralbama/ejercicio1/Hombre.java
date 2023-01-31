/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.oralbama.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Orlando Barragan
 */
public class Hombre extends Persona{

    public Hombre(String name, String sexo, int edad) {
        super(name, sexo, edad);
    }

    public Hombre() {
    }
    

    @Override
    public String getSaludo() {
       return "Hola. Me llamo Pedro y soy un hombre de 42 años.";
    }
    
}
