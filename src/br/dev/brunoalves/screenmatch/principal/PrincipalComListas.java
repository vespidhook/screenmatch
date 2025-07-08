package br.dev.brunoalves.screenmatch.principal;

import br.dev.brunoalves.screenmatch.modelos.Filme;
import br.dev.brunoalves.screenmatch.modelos.Serie;
import br.dev.brunoalves.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chef�o", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPalo = new Filme("Dogville", 2003);
        filmeDoPalo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPalo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPalo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classifica��o " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("AdlanSandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordena��o");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
