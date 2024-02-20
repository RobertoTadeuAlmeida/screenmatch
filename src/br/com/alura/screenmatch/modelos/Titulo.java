package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exeptions.ErroDeConversao;

public class Titulo implements Comparable <Titulo>{

    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double addReviews;
    private int totalReviews;
    private int durationMinutes;

    public Titulo(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.name = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
                throw new ErroDeConversao("Não consegui converter o ano! mais de 4 caracteres.");
        }

        this.releaseYear= Integer.valueOf(meuTituloOmdb.year());
        this.durationMinutes=Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void displaysTechnicalSheet (){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }


    public void evaluate (double note){
        addReviews += note;
        totalReviews++;
    }

    public double takeMedia (){
        return addReviews/ totalReviews;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    // código omitido…

    @Override
    public String toString() {
        return "nome='" + name + '\'' +
                ", anoDeLancamento=" + releaseYear + "," +
                " duração " + durationMinutes;

    }
}
