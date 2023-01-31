/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.oralbama.ejercicio1;

/**
 *
 * @author Orlando Barragan
 */
public abstract class Persona {
    private String name;
    private String sexo;
    private int edad;

    public Persona(String name, String sexo, int edad) {
        this.name = name;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona() {
    }
    

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", sexo=" + sexo + ", edad=" + edad + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract String getSaludo();
    
}
