public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lan�amento " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }


}
