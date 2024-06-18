package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);// esto no es un metodo, son constructorees. sirve para reservar espacio en memoria para colocar atributos.
        //se coloca la clasificacion a cada una de las peliculas y series
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",  2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        //se crea nueva variable de tipo arraylist para almacenar las peliculas y series
        Pelicula p1 = miPelicula;

    //se cambia ArrayList por List para que sea mas generico
        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        //se realiza una iteracion un for para que muestre toString de cada serie y pelicula
        // se realza for each para recorrer la lista
        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            //preguntar si el item no es de una clase mas especifica si lo es realiza el cast
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2) {
               // Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }
           // Pelicula pelicula=(Pelicula) item;
           // System.out.println(pelicula.getClasificacion()); //se forza clase para ser una igual a otra se realiza un cas
        }
        // ordenamiento de lista de artistas ordenar por nombre
        ArrayList<String> ListaDeArtistas = new ArrayList<>();
        ListaDeArtistas.add("Penelope Cruz");
        ListaDeArtistas.add("Antonio Balderas");
        ListaDeArtistas.add("Javier Bardem");
        //lista de artista no ordenanda por nombre
        System.out.println(ListaDeArtistas);
        // para el ordenamiento de lista por nombre se realiza desde el ordenamiento collection que es la liberia que nos ayuda a realizar este tipo de ordenamiento
        //          es un metodo estatico
        Collections.sort(ListaDeArtistas);
        System.out.println("Lista de Artistas ordenadas" +ListaDeArtistas);

        //se crea la logica de comparacion
        Collections.sort(lista);
        System.out.println(" Lista de titulos ordenados " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
System.out.println("Lista de titulos ordenados por fecha de lanzamiento" + lista);
    }

}
