package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion { //clase modelo con herencia

    private String director;

    //Constructor. Se debe implementar el constructor en cada una de las subclases
    public Pelicula(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento); //de esta forma llamo al constructor madre
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    //Polimorfismo
    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaLanzamiento() + ")";
    }
}
