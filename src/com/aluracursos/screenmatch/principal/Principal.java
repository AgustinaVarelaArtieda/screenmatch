package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Tierra de osos", 1998);

        miPelicula.setDuracionEnMinutos(148);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua( 10.00);
        miPelicula.evalua(9.2);
        miPelicula.evalua(8.9);
        System.out.println("Se realizaron " + miPelicula.getTotalEvaluaciones() + " evaluaciones");
        System.out.println("La puntuación de la pelicula es: " + miPelicula.calculaMedia());

        var casaDragon = new Serie("La casa del dragón", 2022);

        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

        //testeo
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        var peliculaDos = new Pelicula("Atlantis", 1999);

        peliculaDos.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaDos);

        System.out.println("***************************************");
        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println("******************* Polimorfismo ********************");
        //Modifico el toString de la clase Pelicula
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
    }
}
