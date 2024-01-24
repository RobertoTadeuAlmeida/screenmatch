import br.com.alura.screenmatch.calculos.FilterRecommendations;
import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("O poderoso chefão",1970);
        myFilm.setDurationMinutes(180);

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);
        System.out.println("Total de avaliações: " + myFilm.getTotalReviews());
        System.out.println(myFilm.takeMedia());

        Film otherFilm = new Film("Avatar",2022);
        otherFilm.setDurationMinutes(280);
        otherFilm.displaysTechnicalSheet();
        otherFilm.evaluate(10);


        Serie lost = new Serie("Lost",2004);
        lost.displaysTechnicalSheet();
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(121/6);
        lost.setMinutesPerEpisode(45);

        System.out.println("Duração para maratonar: " + lost.getDurationMinutes() + " Minutos");

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(lost);

        FilterRecommendations filter =new FilterRecommendations();
        filter.filter(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalVizu(300);
        filter.filter(episode);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(myFilm);
        filmList.add(otherFilm);
        System.out.println("Tamanho da lista " + filmList.size());
        System.out.println("Primeiro filme da lista: " + filmList.get(0).getName());
        System.out.println(filmList.get(0).toString());



    }
}

