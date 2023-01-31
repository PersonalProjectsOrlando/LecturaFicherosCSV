/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.oralbama.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Orlando Barragan
 */
public class Principal {
      
    public static void main(String[] args){
        ManipularCSV lectura = new ManipularCSV();
        ArrayList<Persona> personas=lectura.leerArchivo("E:\\DESARROLLO DE SOFTWARE 2023\\Curso Udemy Java SE EE\\Ejercicios Curso\\Prueba Latinia\\LecturaFicherosCSV\\src\\personas.csv");
        System.out.println("El fichero anterior debe producir la salida:");
        for (int x = 0; x < personas.size(); x++) {
            
            if(personas.get(x).getSexo().equalsIgnoreCase("F") && personas.get(x).getEdad()>=18){
                System.out.println("Hola me llamo  " + personas.get(x).getName() + " y soy una mujer de " + personas.get(x).getEdad()+" años");
            }
            else if(personas.get(x).getSexo().equalsIgnoreCase("M")&& personas.get(x).getEdad()>=18){
                System.out.println("Hola me llamo  " + personas.get(x).getName() + " y soy un hombre de " + personas.get(x).getEdad()+" años");
            }
            else if(personas.get(x).getSexo().equalsIgnoreCase("M")&& personas.get(x).getEdad()<=18){
                System.out.println("Hola me llamo  " + personas.get(x).getName() + " y soy un niño de " + personas.get(x).getEdad()+" años");
            }
            else if(personas.get(x).getSexo().equalsIgnoreCase("F")&& personas.get(x).getEdad()<=18){
                System.out.println("Hola me llamo  " + personas.get(x).getName() + " y soy una niña de " + personas.get(x).getEdad()+" años");
            }           
                        
	}
        
    }
    
}

