/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cine;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CineServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n"); // Solucion con los saltos de linea.
    private ArrayList<Cine> pelicula;

    public CineServicio() {
        this.pelicula = new ArrayList();
    }

    public void crearPelicula() {
        Cine c = new Cine();

        System.out.println("Ingrese el nombre de la Pelicula");

        c.setTitulo(read.next());

        System.out.println("Ingrese la duracion, en minutos");
        double dur = read.nextDouble();

        c.setDuracion((dur / 60));

        System.out.println("Ingrese el director");

        c.setDirector(read.next());

        pelicula.add((new Cine(c.getDirector(), c.getDuracion(), c.getTitulo())));

    }

    public void mostrarPeliculas() {
        // DecimalFormat dec = new DecimalFormat ("#.00"); Delimitar decimales

        for (Cine aux : pelicula) {
            System.out.println(aux.toString());
        }

        System.out.println("---------------------------------------");
    }

    public void duracionMayor() {
        Cine peli = new Cine();

        System.out.println("Se muestran las peliculas con mayor duracion ");
        for (Cine aux : pelicula) {
            if (aux.getDuracion() > 1) {
                System.out.println("La pelicula " + aux.getTitulo() + " dura mas de 1 hora");
            }

        }
        System.out.println("-------------------------------------------------");
    
    }

    public void ordenamientoDuracion(){
        
        System.out.println("Se muestran las peliculas de mayor duracion a menor");
        Collections.sort(pelicula, Comparadores.ordenarDuracionDesendente);
        mostrarPeliculas();
        
        System.out.println("Se nuestran las peliculas de menor duracion a mayor ");
        Collections.sort(pelicula, Comparadores.ordenarDuracionAsendente);
        mostrarPeliculas();
          
      
    }
    public void ordenamientoTitAut(){
         System.out.println("Se nuestran los titulos ordenados alfabeticamente A-Z");
        Collections.sort(pelicula, Comparadores.ordenarTitulos);
        mostrarPeliculas();
        
        System.out.println("Se mostraran los directores ordenados alfabeticamente A-Z");
        Collections.sort(pelicula, Comparadores.ordenarTitulos);
        mostrarPeliculas();
        
    }
    
    
    
    
    
    
    
   
}


