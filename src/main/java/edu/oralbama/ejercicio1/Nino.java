/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.oralbama.ejercicio1;

/**
 *
 * @author Orlando Barragan
 */
public class Nino extends Persona{

    public Nino(String name, String sexo, int edad) {
        super(name, sexo, edad);
    }
    
    @Override
    public String getSaludo() {
        return "Hola. Me llamo Marc y soy un niño de 8 años.";
    }
    
}
