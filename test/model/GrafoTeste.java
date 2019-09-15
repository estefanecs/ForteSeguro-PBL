/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: 12-09-2019
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

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Classe teste para a análise na estrutura de dados grafos.
 *
 * @author Estéfane Carmo de Souza
 */
public class GrafoTeste {

    private Grafo grafo;

    @Before
    public void setUp() throws Exception {
        grafo = Grafo.getInstance();
    }

    @Test
    public void CadastrarPontosELigacoes() {
        assertTrue(grafo.getVertices().isEmpty());

        grafo.addVertice("A", "coleta");
        assertEquals(1, grafo.getVertices().size());

        grafo.addVertice("B", "cruzamento");
        grafo.addVertice("C", "cruzamento");
        grafo.addVertice("D", "cruzamento");
        assertEquals(4, grafo.getVertices().size());

        grafo.addVertice("E", "coleta");
        grafo.addVertice("F", "banco");
        grafo.addVertice("G", "banco");
        grafo.addVertice("H", "banco");
        assertEquals(8, grafo.getVertices().size());

        assertEquals("A", grafo.getVertices().get(0).getConteudo().getNome());
        assertEquals("C", grafo.getVertices().get(2).getConteudo().getNome());
        assertEquals("E", grafo.getVertices().get(4).getConteudo().getNome());
        assertEquals("G", grafo.getVertices().get(6).getConteudo().getNome());

        grafo.addAresta("A", "H", 10);
        grafo.addAresta("A", "C", 3);

        assertEquals("H", grafo.getVertices().procurarNo("A").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("C", grafo.getVertices().procurarNo("A").getAdjacencias().get(1).getConteudo().getDestino().getNome());

        assertEquals("A", grafo.getVertices().procurarNo("H").getAdjacencias().get(0).getConteudo().getDestino().getNome());

        assertEquals("A", grafo.getVertices().procurarNo("C").getAdjacencias().get(0).getConteudo().getDestino().getNome());

        grafo.addAresta("B", "H", 4);
        grafo.addAresta("B", "C", 2);
        grafo.addAresta("B", "G", 3);
        grafo.addAresta("B", "D", 7);

        assertEquals("H", grafo.getVertices().procurarNo("B").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("C", grafo.getVertices().procurarNo("B").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("G", grafo.getVertices().procurarNo("B").getAdjacencias().get(2).getConteudo().getDestino().getNome());
        assertEquals("D", grafo.getVertices().procurarNo("B").getAdjacencias().get(3).getConteudo().getDestino().getNome());

        assertEquals("B", grafo.getVertices().procurarNo("H").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("B", grafo.getVertices().procurarNo("C").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("B", grafo.getVertices().procurarNo("G").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("B", grafo.getVertices().procurarNo("D").getAdjacencias().get(0).getConteudo().getDestino().getNome());

        grafo.addAresta("C", "F", 6);
        assertEquals("C", grafo.getVertices().procurarNo("F").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("F", grafo.getVertices().procurarNo("C").getAdjacencias().get(2).getConteudo().getDestino().getNome());

        grafo.addAresta("H", "D", 10);
        assertEquals("D", grafo.getVertices().procurarNo("H").getAdjacencias().get(2).getConteudo().getDestino().getNome());
        assertEquals("H", grafo.getVertices().procurarNo("D").getAdjacencias().get(1).getConteudo().getDestino().getNome());

        grafo.addAresta("D", "E", 5);
        assertEquals("D", grafo.getVertices().procurarNo("E").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("E", grafo.getVertices().procurarNo("D").getAdjacencias().get(2).getConteudo().getDestino().getNome());

        grafo.addAresta("G", "F", 4);
        assertEquals("G", grafo.getVertices().procurarNo("F").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("F", grafo.getVertices().procurarNo("G").getAdjacencias().get(1).getConteudo().getDestino().getNome());

        grafo.addAresta("F", "E", 3);
        assertEquals("E", grafo.getVertices().procurarNo("F").getAdjacencias().get(2).getConteudo().getDestino().getNome());
        assertEquals("F", grafo.getVertices().procurarNo("E").getAdjacencias().get(1).getConteudo().getDestino().getNome());

        //Remove todos os vertices
        grafo.removerTodosVertice();
        assertTrue(grafo.getVertices().isEmpty());
    }

    @Test
    public void RemoverPontos() {
        assertTrue(grafo.getVertices().isEmpty());

        grafo.addVertice("A", "coleta");
        grafo.addVertice("B", "cruzamento");
        grafo.addVertice("C", "cruzamento");
        grafo.addVertice("D", "cruzamento");
        grafo.addVertice("E", "coleta");
        grafo.addVertice("F", "banco");
        grafo.addVertice("G", "banco");
        grafo.addVertice("H", "banco");

        grafo.addAresta("A", "H", 10);
        grafo.addAresta("A", "C", 3);
        grafo.addAresta("B", "H", 4);
        grafo.addAresta("B", "C", 2);
        grafo.addAresta("B", "G", 3);
        grafo.addAresta("B", "D", 7);
        grafo.addAresta("C", "F", 6);
        grafo.addAresta("H", "D", 10);
        grafo.addAresta("D", "E", 5);
        grafo.addAresta("G", "F", 4);
        grafo.addAresta("F", "E", 3);

        assertEquals(8, grafo.getVertices().size());
        //Removendo o vertice "H"
        assertEquals("A", grafo.getVertices().procurarNo("H").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("B", grafo.getVertices().procurarNo("H").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("D", grafo.getVertices().procurarNo("H").getAdjacencias().get(2).getConteudo().getDestino().getNome());
        grafo.removerVertice("H");

        assertEquals(7, grafo.getVertices().size());

        assertEquals("C", grafo.getVertices().procurarNo("A").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals(1, grafo.getVertices().procurarNo("A").getAdjacencias().size());

        assertEquals("C", grafo.getVertices().procurarNo("B").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("G", grafo.getVertices().procurarNo("B").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("D", grafo.getVertices().procurarNo("B").getAdjacencias().get(2).getConteudo().getDestino().getNome());
        assertEquals(3, grafo.getVertices().procurarNo("B").getAdjacencias().size());

        assertEquals("B", grafo.getVertices().procurarNo("D").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("E", grafo.getVertices().procurarNo("D").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals(2, grafo.getVertices().procurarNo("D").getAdjacencias().size());

        //Removendo o vértice "F"
        assertEquals("C", grafo.getVertices().procurarNo("F").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("G", grafo.getVertices().procurarNo("F").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("E", grafo.getVertices().procurarNo("F").getAdjacencias().get(2).getConteudo().getDestino().getNome());

        assertEquals(2, grafo.getVertices().procurarNo("E").getAdjacencias().size());
        assertEquals(2, grafo.getVertices().procurarNo("G").getAdjacencias().size());
        assertEquals(3, grafo.getVertices().procurarNo("C").getAdjacencias().size());

        grafo.removerVertice("F");

        assertEquals(6, grafo.getVertices().size());

        assertEquals("D", grafo.getVertices().procurarNo("E").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals(1, grafo.getVertices().procurarNo("E").getAdjacencias().size());

        assertEquals("B", grafo.getVertices().procurarNo("G").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals(1, grafo.getVertices().procurarNo("G").getAdjacencias().size());

        assertEquals("A", grafo.getVertices().procurarNo("C").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("B", grafo.getVertices().procurarNo("C").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals(2, grafo.getVertices().procurarNo("C").getAdjacencias().size());

        //Remove todos os vertices
        grafo.removerTodosVertice();
        assertTrue(grafo.getVertices().isEmpty());

    }

    @Test
    public void RemoverLigacoes() {
        assertTrue(grafo.getVertices().isEmpty());

        grafo.addVertice("A", "coleta");
        grafo.addVertice("B", "cruzamento");
        grafo.addVertice("C", "cruzamento");
        grafo.addVertice("D", "cruzamento");
        grafo.addVertice("E", "coleta");
        grafo.addVertice("F", "banco");
        grafo.addVertice("G", "banco");
        grafo.addVertice("H", "banco");

        grafo.addAresta("A", "H", 10);
        grafo.addAresta("A", "C", 3);
        grafo.addAresta("B", "H", 4);
        grafo.addAresta("B", "C", 2);
        grafo.addAresta("B", "G", 3);
        grafo.addAresta("B", "D", 7);
        grafo.addAresta("C", "F", 6);
        grafo.addAresta("H", "D", 10);
        grafo.addAresta("D", "E", 5);
        grafo.addAresta("G", "F", 4);
        grafo.addAresta("F", "E", 3);

        assertEquals(8, grafo.getVertices().size());

        assertEquals("A", grafo.getVertices().get(0).getConteudo().getNome());
        assertEquals("B", grafo.getVertices().get(1).getConteudo().getNome());
        assertEquals("C", grafo.getVertices().get(2).getConteudo().getNome());
        assertEquals("D", grafo.getVertices().get(3).getConteudo().getNome());
        assertEquals("E", grafo.getVertices().get(4).getConteudo().getNome());
        assertEquals("F", grafo.getVertices().get(5).getConteudo().getNome());
        assertEquals("G", grafo.getVertices().get(6).getConteudo().getNome());
        assertEquals("H", grafo.getVertices().get(7).getConteudo().getNome());

        //Remorção da Aresta AH
        assertEquals(2, grafo.getVertices().procurarNo("A").getAdjacencias().size());
        assertEquals(3, grafo.getVertices().procurarNo("H").getAdjacencias().size());

        assertEquals("A", grafo.getVertices().procurarNo("H").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("H", grafo.getVertices().procurarNo("A").getAdjacencias().get(0).getConteudo().getDestino().getNome());

        grafo.removerAresta("A", "H");

        assertEquals(1, grafo.getVertices().procurarNo("A").getAdjacencias().size());
        assertEquals(2, grafo.getVertices().procurarNo("H").getAdjacencias().size());

        //Remorção da Aresta CB
        assertEquals(3, grafo.getVertices().procurarNo("C").getAdjacencias().size());
        assertEquals(4, grafo.getVertices().procurarNo("B").getAdjacencias().size());

        assertEquals("B", grafo.getVertices().procurarNo("C").getAdjacencias().get(1).getConteudo().getDestino().getNome());
        assertEquals("C", grafo.getVertices().procurarNo("B").getAdjacencias().get(1).getConteudo().getDestino().getNome());

        grafo.removerAresta("C", "B");

        assertEquals(2, grafo.getVertices().procurarNo("C").getAdjacencias().size());
        assertEquals(3, grafo.getVertices().procurarNo("B").getAdjacencias().size());

        //Remorção da Aresta ED
        assertEquals(2, grafo.getVertices().procurarNo("E").getAdjacencias().size());
        assertEquals(3, grafo.getVertices().procurarNo("D").getAdjacencias().size());

        assertEquals("D", grafo.getVertices().procurarNo("E").getAdjacencias().get(0).getConteudo().getDestino().getNome());
        assertEquals("E", grafo.getVertices().procurarNo("D").getAdjacencias().get(2).getConteudo().getDestino().getNome());

        grafo.removerAresta("E", "D");

        assertEquals(1, grafo.getVertices().procurarNo("E").getAdjacencias().size());
        assertEquals(2, grafo.getVertices().procurarNo("D").getAdjacencias().size());

        //Remove todos os vertices
        grafo.removerTodosVertice();
        assertTrue(grafo.getVertices().isEmpty());

    }

    @Test
    public void ImportarArquivo() throws IOException {
        grafo.importarArquivo("arquivoGrafo.txt");
        assertEquals(51, grafo.getVertices().size());

        grafo.removerTodosVertice();
        assertTrue(grafo.getVertices().isEmpty());

    }

    @Test
    public void AlterarEstacionamentoEBanco() {
        assertTrue(grafo.getVertices().isEmpty());

        grafo.addVertice("A", "coleta");
        grafo.addVertice("B", "cruzamento");
        grafo.addVertice("C", "cruzamento");
        grafo.addVertice("D", "estacionamento");
        grafo.addVertice("E", "coleta");
        grafo.addVertice("F", "banco");
        grafo.addVertice("G", "banco");
        grafo.addVertice("H", "cruzamento");

        grafo.addAresta("A", "H", 10);
        grafo.addAresta("A", "C", 3);
        grafo.addAresta("B", "H", 4);
        grafo.addAresta("B", "C", 2);
        grafo.addAresta("B", "G", 3);
        grafo.addAresta("B", "D", 7);
        grafo.addAresta("C", "F", 6);
        grafo.addAresta("H", "D", 10);
        grafo.addAresta("D", "E", 5);
        grafo.addAresta("G", "F", 4);
        grafo.addAresta("F", "E", 3);

        assertEquals(8, grafo.getVertices().size());

        //Alterar estacionamento 
        assertEquals("D", grafo.getVertices().get(3).getConteudo().getNome());
        assertEquals("estacionamento", grafo.getVertices().get(3).getConteudo().getTipo());

        assertEquals("H", grafo.getVertices().get(7).getConteudo().getNome());
        assertEquals("cruzamento", grafo.getVertices().get(7).getConteudo().getTipo());

        grafo.alterarEstacionamento("H");

        assertEquals("D", grafo.getVertices().get(3).getConteudo().getNome());
        assertEquals("cruzamento", grafo.getVertices().get(3).getConteudo().getTipo());

        assertEquals("H", grafo.getVertices().get(7).getConteudo().getNome());
        assertEquals("estacionamento", grafo.getVertices().get(7).getConteudo().getTipo());
        
        //ALterar banco da rota
        //Remove todos os vertices
        grafo.removerTodosVertice();
        assertTrue(grafo.getVertices().isEmpty());

    }
//TESTAR ISSO E VER SE AO TROCAR O ESTACIONAMENTO E BANCO, É ATUALIZADO O CAMINHO

    @Test
    public void CalcularCaminho() {
        assertTrue(grafo.getVertices().isEmpty());
        grafo.addVertice("A", "banco");
        grafo.addVertice("B", "cruzamento");
        grafo.addVertice("C", "banco");
        grafo.addVertice("D", "cruzamento");
        grafo.addVertice("E", "coleta");
        grafo.addVertice("N", "coleta");
        grafo.addVertice("I", "estacionamento");

        grafo.addAresta("A", "B", 6);
        grafo.addAresta("A", "D", 4);
        grafo.addAresta("B", "C", 10);
        grafo.addAresta("B", "D", 7);
        grafo.addAresta("B", "E", 7);
        grafo.addAresta("C", "D", 8);
        grafo.addAresta("C", "N", 6);
        grafo.addAresta("C", "E", 5);
        grafo.addAresta("C", "I", 3);
        grafo.addAresta("N", "E", 7);
        grafo.addAresta("D", "E", 12);

        assertEquals(7, grafo.getVertices().size());
/*
        assertEquals("I - C - E - C\nO tempo do trajeto é de 13", grafo.calcularRota("E", "C"));
        assertEquals("I - C - N - C - D - A\nO tempo do trajeto é de 27", grafo.calcularRota("N", "A"));

        //Altera o estacionamento
        assertEquals("I - C - N - C - D - A\nO tempo do trajeto é de 27", grafo.calcularRota("N", "A"));
        grafo.alterarEstacionamento("D");
        assertEquals("D - C - N - C - D - A\nO tempo do trajeto é de 32", grafo.getRota());

        //Altera o banco
        assertEquals("D - E - B - A\nO tempo do trajeto é de 25", grafo.calcularRota("E", "A"));
        grafo.alterarBanco("D");
        assertEquals("D - E - C\nO tempo do trajeto é de 17", grafo.getRota());
*/
        //Remove todos os vertices
        grafo.removerTodosVertice();
        assertTrue(grafo.getVertices().isEmpty());
    }

}
