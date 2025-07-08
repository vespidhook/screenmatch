package br.dev.brunoalves.screenmatch.principal;

import br.dev.brunoalves.screenmatch.calculos.CalculadoraDeTempo;
import br.dev.brunoalves.screenmatch.calculos.FiltroRecomendacao;
import br.dev.brunoalves.screenmatch.modelos.Episodio;
import br.dev.brunoalves.screenmatch.modelos.Filme;
import br.dev.brunoalves.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1985);
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("===========================");

        Serie lost = new Serie("Lost", 2000);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost " + lost.getDuracaoEmMinutos());

        System.out.println("===========================");

        Filme outroFilme = new Filme("Avatar", 2023);
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("===========================");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        System.out.println("===========================");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra((episodio));

        System.out.println("===========================");

        var filmeDoPaulo = new Filme("Dogville", 2003);
//        filmeDoPaulo.setNome("Dog Ville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
//        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString " + listaDeFilmes.get(0).toString());

        System.out.println("===========================");



    }
}
