package com.exercicio001;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    // Construtor da lista encadeada
    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // Adiciona um novo elemento à lista
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (isEmpty()) {
            // Se a lista estiver vazia, o novo nó se torna a referência de entrada
            referenciaEntrada = novoNo;
            return;
        }

        // Encontrar o último nó e adiciona o novo nó como seu próximo
        No<T> ultimoNo = getNo(size() - 1);
        ultimoNo.setProximoNo(novoNo);
    }

    // Obtém o conteúdo de um elemento da lista com base no índice
    public T get(int index) {
        return getNo(index).getConteudo();
    }

    // Remove um elemento da lista com base no índice e retorna seu conteúdo
    public T remove(int index) {
        No<T> noPivot = getNo(index);
        if (index == 0) {
            // Se o índice for 0, o primeiro nó é removido e a referência é atualizada
            referenciaEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }

        // Se o índice não for 0, o nó anterior é ajustado para apontar para o próximo nó
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivot.getProximoNo());
        return noPivot.getConteudo();
    }

    // Obtém o nó correspondente ao índice especificado
    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    // Obtém o tamanho atual da lista
    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        // Itera sobre a lista até encontrar o final
        while (referenciaAux != null) {
            tamanhoLista++;
            referenciaAux = referenciaAux.getProximoNo();
        }
        return tamanhoLista;
    }

    // Valida se o índice fornecido é válido para a lista
    private void validaIndice(int index) {
        if (index < 0 || index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Índice " + index + " inválido. A lista vai até o índice " + ultimoIndice);
        }
    }

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return referenciaEntrada == null;
    }

    // Representação em string da lista encadeada
    @Override
    public String toString() {
        StringBuilder strRetorno = new StringBuilder();
        No<T> noAuxiliar = referenciaEntrada;
        // Itera sobre a lista e constrói a representação em string
        for (int i = 0; i < this.size(); i++) {
            strRetorno.append("No---> { >> conteudo=").append(referenciaEntrada).append("--->").append('}');
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno.append("null");
        return strRetorno.toString();
    }
}
