/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.oralbama.ejercicio1;

/**
 *
 * @author Orlando Barragan
 */
public class Nina extends Persona{

    public Nina(String name, String sexo, int edad) {
        super(name, sexo, edad);
    }
    

    @Override
    public String getSaludo() {
        return "Hola. Me llamo Andrea y soy una niña de 14 años.";
    }
    
}
