/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4clc;

import Entidades.Cine;
import Servicio.CineServicio;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejercicio4CLC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CineServicio Cn = new CineServicio();
        Scanner read = new Scanner(System.in);

        String close = "";

        do {
            Cn.crearPelicula();

            System.out.println("¿Desea ingresar otra pelicula? ");
            close = read.nextLine();
            

        } while (close.equalsIgnoreCase("si"));
        
        Cn.mostrarPeliculas();
        Cn.duracionMayor();
        Cn.ordenamientoDuracion();
        Cn.ordenamientoTitAut();
        
       
    }

}
