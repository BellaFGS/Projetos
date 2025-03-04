package br.com.estudos.screenmatch.calculos;

public class Recomendacao {
    private String recomendacao;


    public void filtro(Classifica classificado){
        if (classificado.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificado.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Filme em baixa");
        }
    }
}
