/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Cine;
import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class Comparadores {//Para las collections hacer su propio Servicio para los metodos a utilizar.
    
    public static Comparator<Cine> ordenarDuracionDesendente = new Comparator<Cine>(){
        @Override
          public int compare(Cine objeto1, Cine objeto2) {
                return objeto1.getDuracion().compareTo(objeto2.getDuracion());
            }
        
    };

    
    public static Comparator<Cine> ordenarDuracionAsendente = new Comparator<Cine>(){
        @Override
          public int compare(Cine objeto2, Cine objeto1) {
                return objeto2.getDuracion().compareTo(objeto1.getDuracion());
            }
        
    };
    
  public static Comparator<Cine> ordenarTitulos = new Comparator<Cine>(){
        @Override
          public int compare(Cine objeto1, Cine objeto2) {
                return objeto1.getTitulo().compareTo(objeto2.getTitulo());
            }
  };
  
  public static Comparator<Cine> ordenarPorDirector = new Comparator<Cine>(){
        @Override
          public int compare(Cine objeto1, Cine objeto2) {
                return objeto1.getDirector().compareTo(objeto2.getDirector());
            }
  };
}
        
  
