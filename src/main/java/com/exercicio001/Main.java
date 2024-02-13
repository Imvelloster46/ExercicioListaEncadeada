package com.exercicio001;

public class Main {
    public static void main(String[] args) {
        // Cria uma nova lista encadeada de strings
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        // Adiciona alguns elementos à lista
        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");
        minhaListaEncadeada.add("teste5");
        minhaListaEncadeada.add("teste6");

        // Imprime os elementos em posições específicas da lista
        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        // Imprime a representação da lista encadeada
        System.out.println(minhaListaEncadeada);

        // Remove um elemento da posição 3 e imprime seu conteúdo
        System.out.println(minhaListaEncadeada.remove(3));

        // Imprime a representação da lista encadeada após a remoção
        System.out.println(minhaListaEncadeada);
    }
}
