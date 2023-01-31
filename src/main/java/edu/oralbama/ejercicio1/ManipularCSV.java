/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.oralbama.ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Orlando Barragan
 */
public class ManipularCSV {
    private BufferedReader lector;
    private String linea;
    String[] partes=null;
    ArrayList<Persona> personas = new ArrayList<>();
    public  ArrayList<Persona> leerArchivo(String nombreArchivo){
         System.out.println("Ejemplo de fichero “personas.csv”:");
        try{
            lector = new BufferedReader (new FileReader(nombreArchivo));
            while ((linea=lector.readLine())!=null){
                partes = linea.split(",");
                personas.add(new Nino(partes[0],partes[1],Integer.parseInt(partes[2])));
               
                imprimirLinea();
                
                System.out.println();
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return personas;
    }
    public void imprimirLinea(){
        
        for(int i=0;i<partes.length;i++){
            System.out.print(partes[i]+", ");
        }
    }
    
}
