import br.com.alura.screenmatch.modelos.Film;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("O poderoso chefão");
        myFilm.setReleaseYear(1970);
        myFilm.setDurationMinutes(180);

        myFilm.displaysTechnicalSheet();
        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);
        System.out.println("Total de avaliações: " + myFilm.getTotalReviews());
        System.out.println(myFilm.takeMedia());

    }
}

