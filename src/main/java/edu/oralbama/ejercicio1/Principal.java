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
/*
1) Definir una clase abstracta Persona con las siguientes características:
a. Atributos: nombre y edad.
b. Setters y getters para todos los atributos.
c. Método abstracto “getSaludo”. Las diferentes implementaciones de este método devolverán un String con el contenido “Hola. Me llamo
<nombre> y soy un/a <tipo_persona> de <edad> años.”
2) Definir cuatro clases heredadas de Persona: Niño, Niña, Hombre y Mujer.
3) Definir una última clase Main.java que será el punto de entrada del programa, y en ella se realizarán las siguientes acciones:
a. Construir un Vector de personas con los datos del fichero “personas.csv”
b. Iterar el vector para que todas las personas saluden.
- El fichero “personas.csv” contendrá una persona en cada línea. Una línea se compone de los campos: nombre,sexo,edad
- El sexo podrá ser “M” (masculino) o “F”(femenino).
- Si una persona es mayor de 18 años se considerará un hombre (o mujer), y si es menor de 18 será un niño o niña.
Ejemplo de fichero “personas.csv”:
El fichero anterior debe producir la salida:
Hola. Me llamo Ana y soy una mujer de 35 años. Hola. Me llamo Pedro y soy un hombre de 42 años. Hola. Me llamo Juan y soy un hombre de 39 años. Hola. Me llamo Marc y soy un niño de 8 años.
Hola. Me llamo Andrea y soy una niña de 14 años.
Ana,F,35
Pedro,M,42 Juan,M,39 Marc,M,8 Andrea,F,14
*/

