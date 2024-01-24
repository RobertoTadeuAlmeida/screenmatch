package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Serie serie;
    private int totalVizu;

    public int getTotalVizu() {
        return totalVizu;
    }

    public void setTotalVizu(int totalVizu) {
        this.totalVizu = totalVizu;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassifiabe() {
        if (totalVizu > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
