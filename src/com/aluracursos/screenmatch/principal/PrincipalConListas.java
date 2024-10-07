package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Tierra de osos", 1998);
        miPelicula.evalua(9);

        var peliculaDos = new Pelicula("Atlantis", 1999);
        peliculaDos.evalua(6);

        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        var casaDragon = new Serie("La casa del dragón", 2022);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(peliculaDos);
        lista.add(casaDragon);
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);

        for (Titulo item: lista){
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificación: " + pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println("Lista de artistas no ordenada: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista de títulos ordenada por fecha: " + lista);
    }
}
