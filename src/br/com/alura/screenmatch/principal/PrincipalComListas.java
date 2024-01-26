package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Film filme1 = new Film("O poderoso chefão", 1970);
        Film filme2 = new Film("Avatar", 2023);
        var filme3 = new Film("Dogville", 2003);
        Serie serie1 = new Serie("Lost", 2004);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(filme1);
        list.add(filme2);
        list.add(filme3);
        list.add(serie1);
        for (Titulo item : list) {
            System.out.println(item.getName());
            if (item instanceof Film filme && filme.getClassifiabe() > 2) {
                System.out.println("Classificação" + filme.getClassifiabe());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        System.out.println();

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Titulo::getReleaseYear));
        System.out.println("Ordenando por ano");
        System.out.println(list);



    }

}
