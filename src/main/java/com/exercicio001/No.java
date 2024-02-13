package com.exercicio001;

public class No<T> {
    private T conteudo;
    private No<T> proximoNo; // Corrigindo o uso do tipo raw para usar o tipo parametrizado T

    // Construtor padrão para criar um nó sem conteúdo e sem próximo nó
    public No() {
        this.proximoNo = null;
    }

    // Construtor para criar um nó com conteúdo e sem próximo nó
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    // Obtém o conteúdo do nó
    public T getConteudo() {
        return conteudo;
    }

    // Define o conteúdo do nó
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    // Obtém o próximo nó
    public No<T> getProximoNo() {
        return proximoNo;
    }

    // Define o próximo nó
    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    // Representação em string do nó
    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    // Representação em string do nó e seus subsequentes (encadeados)
    public String toStringEncadeado() {
        String str = "No{" +
                "conteudo=" + conteudo +
                '}';

        // Se houver um próximo nó, adiciona sua representação em string
        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            // Se não houver próximo nó, indica null
            str += "-null";
        }
        return str;
    }
}
