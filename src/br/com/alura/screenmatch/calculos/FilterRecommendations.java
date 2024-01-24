package br.com.alura.screenmatch.calculos;

public class FilterRecommendations {

    public void filter (Classifiable classifiable){
        if (classifiable.getClassifiabe() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classifiable.getClassifiabe() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
