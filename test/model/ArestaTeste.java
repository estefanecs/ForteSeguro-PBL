/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: 24-08-2019
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
package model;

import model.Aresta;
import model.Vertice;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe teste para a análise na criação de objetos do tipo Aresta e alterações
 * em seus atributos
 *
 * @author Estéfane Carmo de Souza
 */
public class ArestaTeste {

    private Vertice v1, v2, v3;
    private Aresta aresta;

    @Before
    public void setUp() throws Exception {
        v1 = new Vertice("A", "banco");
        v2 = new Vertice("B", "coleta");
        v3 = new Vertice("C", "cruzamento");
    }

    @Test
    public void testeBasico() {
        aresta = new Aresta(v1, 10);

        assertEquals(v1, aresta.getDestino());
        assertEquals(10, aresta.getPeso());

        aresta.setDestino(v2);
        assertEquals(v2, aresta.getDestino());
        assertEquals(10, aresta.getPeso());

        aresta.setDestino(v3);
        assertEquals(v3, aresta.getDestino());

        aresta.setPeso(19);
        assertEquals(19, aresta.getPeso());

    }
}
