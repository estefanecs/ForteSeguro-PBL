/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: -09-2019
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
import java.util.LinkedList;
import model.Grafo;
import util.Node;


/**
 * Esta classe é um controlador da interface AlterarPontos
 *
 * Exemplo de uso:
 *
 * ControllerAlterarPontos controller= new ControllerAlterarPontos();
 *
 * @author Estéfane Carmo de Souza
 */
public class ControllerAlterarPontos {

    public ControllerAlterarPontos() {
    }
    public String TrocarEstacionamento(String novaLocalizacao){
        Grafo grafo= Grafo.getInstance();
        return grafo.alterarEstacionamento(novaLocalizacao);   
    }
    public String trocarBanco(String novoBanco){
        Grafo grafo= Grafo.getInstance();
        return grafo.alterarBanco(novoBanco);   
        
    }      
     public ArrayList addPontosComboBox() {
        Grafo grafo = Grafo.getInstance();
        ArrayList listaDeBancos = grafo.ListarTodosPontos();
        return listaDeBancos;
    }
    public ArrayList addBancosComboBox() {
        Grafo grafo = Grafo.getInstance();
        ArrayList listaDeBancos = grafo.ListarPontos("banco");
        return listaDeBancos;
    }
}
