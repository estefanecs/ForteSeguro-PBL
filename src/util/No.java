/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: 13-07-2019
 *
 * Declaro que este código foi elaborado por mim de forma individual e
 * não contém nenhum trecho de código de outro colega ou de outro autor,
 * tais como provindos de livros e apostilas, e páginas ou documentos
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que
 * uma citação para o  não a minha está destacado com  autor e a fonte do
 * código, e estou ciente que estes trechos não serão considerados para fins
 * de avaliação. Alguns trechos do código podem coincidir com de outros
 * colegas pois estes foram discutidos em sessões tutorias.
 */
package util;

import model.Aresta;

/**
 * Classe para objetos do tipo Node, que contém seus atributos e métodos. Possui
 * uma referência para o conteúdo do nó e a referência para o nó seguinte.
 *
 * Exemplo de uso:
 *
 * Node node= new Node("conteudo");
 *
 * @author Estéfane Carmo de Souza
 */
public class No {

    private Aresta conteudo;
    private No next;

    public No() {
    }

    public No(Aresta conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Método que obtém o próximo Nó
     *
     * @return Node - O próximo nó
     */
    public No getNext() {
        return next;
    }

    /**
     * Método que obtém o conteúdo do Nó
     *
     * @return Object - O conteúdo
     */
    public Aresta getConteudo() {
        return conteudo;
    }

    /**
     * Método que modifica a referência do próximo, para um outro nó.
     *
     * @param newNext - O novo próximo nó
     */
    public void setNext(No newNext) {
        next = newNext;
    }

    /**
     * Método que modifica o conteúdo do nó
     *
     * @param novoConteudo - O novo conteúdo do nó
     */
    public void setConteudo(Aresta novoConteudo) {
        conteudo = novoConteudo;
    }
}
