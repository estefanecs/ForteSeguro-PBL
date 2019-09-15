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
import util.Node;


/**
 * Esta classe é um controlador da interface ImportarArquivo
 *
 * Exemplo de uso:
 *
 * ControllerArquivo controller= new ControllerArquivo();
 *
 * @author Estéfane Carmo de Souza
 */
public class ControllerRemover {

    public ControllerRemover() {
    }
 public String removerPonto(String nome){
         Grafo grafo= Grafo.getInstance();
         return grafo.removerVertice(nome);
    }
    public String removerLigacao(String vertice1, String vertice2){
      Grafo grafo= Grafo.getInstance();
       return grafo.removerAresta(vertice1, vertice2);
    }
    public ArrayList addPontosComboBox() {
        Grafo grafo = Grafo.getInstance();
        ArrayList listaDeBancos = grafo.ListarTodosPontos();
        return listaDeBancos;
    }
}
