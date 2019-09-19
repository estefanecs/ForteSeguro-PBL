/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: 04-09-2019
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
package controller;

import java.util.ArrayList;
import model.Grafo;


/**
 * Esta classe é um controlador da interface Adicionar
 *
 * Exemplo de uso:
 *
 * ControllerAdicionar controller= new ControllerAdicionar();
 *
 * @author Estéfane Carmo de Souza
 */
public class ControllerAdicionar {

    public ControllerAdicionar() {
        
    }
    public void adicionarPonto(String nome, String tipo){
         Grafo grafo= Grafo.getInstance();
         grafo.addVertice(nome, tipo);
    }
    public void adicionarLigacao(String vertice1, String vertice2, int pesoAresta){
      Grafo grafo= Grafo.getInstance();
       grafo.addAresta(vertice1, vertice2, pesoAresta);
    }
   public ArrayList addPontosComboBox() {
        Grafo grafo = Grafo.getInstance();
        ArrayList listaDeBancos = grafo.listarTodosPontos();
        return listaDeBancos;
    }
}
