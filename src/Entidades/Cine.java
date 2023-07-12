/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author LENOVO
 */
public class Cine {

    private String titulo;

    private Double duracion;
    
    private String director;

    public Cine() {

    }

    public Cine(String titulo, Double duracion, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
    }

  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

 
    @Override
    public String toString() {
        return "Cine{" + "titulo: " + titulo + ", director: " + director + ", duracion: " + duracion +"hs" + '}';
    }

    
}
