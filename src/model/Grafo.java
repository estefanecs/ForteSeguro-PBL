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

import util.LinkedList2;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import util.List2;
import util.No;
import util.Node;

/**
 * Esta classe armazena os dados de um grafo, no qual possui uma referência para
 * a lista com todos os vertices presentes.
 *
 * Exemplo de uso:
 *
 * Grafo grafo= new Grafo();
 *
 * @author Estéfane Carmo de Souza
 */
public class Grafo {

    private static Grafo instancia;
    private List2 vertices;
    private String rota;
    private String pontoColeta;
    private String pontoChegada;


    private Grafo() {
        vertices = new List2();
        rota = null;
        pontoColeta = null;
        pontoChegada = null;
    }

    public static synchronized Grafo getInstance() {
        if (instancia == null) {
            instancia = new Grafo();
        }
        return instancia;
    }

    public List2 getVertices() {
        return vertices;
    }

    public String getRota() {
        return rota;
    }

    public String getPontoColeta() {
        return pontoColeta;
    }

    public String getPontoChegada() {
        return pontoChegada;
    }

    public void addVertice(String nome, String tipo) {
        Vertice vertice = new Vertice(nome, tipo);
        vertices.add(vertice);
    }

    public void addAresta(String nomeV1, String nomeV2, int peso) {
        Vertice v1 = vertices.procurarNo(nomeV1);
        Vertice v2 = vertices.procurarNo(nomeV2);

        Aresta aresta1 = new Aresta(v1, peso);
        Aresta aresta2 = new Aresta(v2, peso);

        vertices.procurarNo(nomeV2).getAdjacencias().add(aresta1);
        vertices.procurarNo(nomeV1).getAdjacencias().add(aresta2);
    }

    public void removerVertice(String nome) {
        Vertice removido = vertices.remove(nome);
        No auxiliar = removido.getAdjacencias().getPrimeiro();
        while (auxiliar != null) {
            auxiliar.getConteudo().getDestino().getAdjacencias().remove(removido.getNome());
            auxiliar = auxiliar.getNext();
        }
    }

    public String recalcularRota(String nome) {
        if (rota != null && rota.contains(nome)) {
            rota = null;
            return calcularRota(this.pontoColeta, this.pontoChegada);
        }
        return "";
    }

    public String removerAresta(String nome1, String nome2) {
        //removendo a aresta do primeiro vertice
        int posicaoV1 = vertices.getPosicao(nome1);
        int posicaoV2 = vertices.getPosicao(nome2);
        if (posicaoV1 != -1 && posicaoV2 != -1) {
            vertices.get(posicaoV1).getConteudo().getAdjacencias().remove(nome2);
            //removendo a aresta do segundo nó
            vertices.get(posicaoV2).getConteudo().getAdjacencias().remove(nome1);
        }
        if (rota != null && (rota.contains(nome1 + " - " + nome2) || rota.contains(nome2 + " - " + nome1))) {
            rota = null;
            return calcularRota(this.pontoColeta, this.pontoChegada);
        }
        return "";
    }

    public String alterarEstacionamento(String novaLocalizacao) {
        //Procura o estacionamento
        Node auxiliar = vertices.getPrimeiro();
        while (auxiliar.getConteudo().getTipo().compareToIgnoreCase("estacionamento") != 0 && auxiliar != null) {
            auxiliar = auxiliar.getNext();
        }
        //Se encontrar o estacionamento troca a referência do tipo
        if (auxiliar != null) {
            String tipo = auxiliar.getConteudo().getTipo();
            Vertice novo2 = vertices.procurarNo(novaLocalizacao);
            auxiliar.getConteudo().setTipo(novo2.getTipo());
            vertices.procurarNo(novaLocalizacao).setTipo(tipo);
        }
        if (rota != null) {
            rota = null;
            return calcularRota(this.pontoColeta, this.pontoChegada);
        }
        return "";
    }

    public void importarArquivo(String nome_arq) throws IOException {
        BufferedReader ler = null;
        int contador = 0;
        try {
            ler = new BufferedReader(new FileReader(nome_arq));
            contador = Integer.parseInt(ler.readLine());
            while (contador > 0) {
                String linha = ler.readLine();//lê a linha
                String[] parts = linha.split(" "); //divide a linha em duas partes
                String nome = parts[0]; //primeira parte contém o nome da imagem
                String tipo = parts[1]; //converte a string com números para double
                this.addVertice(nome, tipo);
                contador--;//incrementa o contador de imagens importadas
            }
            String vertice1;
            String linha = ler.readLine(); //lê a linha e armazena na string
            while (linha != null) { //enquanto não for o fim do arquivo
                vertice1 = linha; //armazena os dados da linha anterior
                linha = ler.readLine();//lê a proxima linha
                String[] adjacencia = linha.split(" ");
                for (int i = 0; i < adjacencia.length; i = i + 2) {
                    String vertice2 = adjacencia[i];
                    int peso = Integer.parseInt(adjacencia[i + 1]);
                    this.addAresta(vertice1, vertice2, peso);
                }
                linha = ler.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            throw new IOException();
        } finally {
            if (ler != null) {
                ler.close(); //fecha o arquivo
            }
        }
    }

    public String alterarBanco(String novoPontodeChegada) {
        if (rota != null) {
            pontoChegada = novoPontodeChegada;
            return calcularRota(this.pontoColeta, this.pontoChegada);
        }
        return "";
    }

    public String calcularRota(String vertice, String banco) {
        this.pontoChegada = banco;
        this.pontoColeta = vertice;

       LinkedList2 caminho = new LinkedList2();
        System.out.println(" posicao " + pontoChegada);
        Vertice verticeAtual;
        int pesoAtual;
        vertices.procurarNo(vertice).setVisitado(true);
        int nTree = 0;
        Vertice v = vertices.procurarNo(vertice);
        Node aux3 = vertices.getPrimeiro();
        Aresta aresta;
        while (aux3 != null) {
            int posicao = aux3.getConteudo().getAdjacencias().getPosicao(vertice);
            if (posicao == -1) {
                aresta = new Aresta(v, 1000);
            } else {
                aresta = new Aresta(v, aux3.getConteudo().getAdjacencias().get(posicao).getConteudo().getPeso());
            }
            caminho.add(aresta);
            aux3 = aux3.getNext();
        }
        int minDist = caminho.get(getMin(caminho)).getConteudo().getPeso();
        while (nTree < vertices.size() && minDist != 1000) {
            nTree++;
            int indexMin = getMin(caminho);
            minDist = caminho.get(indexMin).getConteudo().getPeso();
            if (minDist != 1000) {
                verticeAtual = vertices.get(indexMin).getConteudo();
                pesoAtual = caminho.get(indexMin).getConteudo().getPeso();
                vertices.get(indexMin).getConteudo().setVisitado(true);
                ajustarVertices(verticeAtual, pesoAtual,caminho);
            }
        }
        this.alterarVisitacao();
        this.salvarRota(banco, vertice,caminho);
        return rota;
    }

    public void alterarVisitacao() {
        Node auxiliar = vertices.getPrimeiro();
        while (auxiliar != null) {
            auxiliar.getConteudo().setVisitado(false);
            auxiliar = auxiliar.getNext();
        }
    }

    public int getMin(LinkedList2 caminho) {
        int min = 1000;
        int posicao = 0;
        for (int i = 0; i < vertices.size(); i++) {
            if (!vertices.get(i).getConteudo().isVisitado() && caminho.get(i).getConteudo().getPeso() < min) {
                min = caminho.get(i).getConteudo().getPeso();
                posicao = i;
            }
        }
        return posicao;
    }

    public void ajustarVertices(Vertice currentVert, int startToCurrent,LinkedList2 caminho) {
        int coluna = 0;
        int current = 0;
        while (coluna < vertices.size()) {
            if (!vertices.get(coluna).getConteudo().isVisitado()) {
                int posicao = vertices.get(coluna).getConteudo().getAdjacencias().getPosicao(currentVert.getNome());
                if (posicao != -1) {
                    current = vertices.get(coluna).getConteudo().getAdjacencias().get(posicao).getConteudo().getPeso();
                } else {
                    current = 1000;
                }
                int start = current + startToCurrent;
                int sPathDist = caminho.get(coluna).getConteudo().getPeso();
                if (start < sPathDist) {
                    caminho.get(coluna).getConteudo().setDestino(currentVert);
                    caminho.get(coluna).getConteudo().setPeso(start);
                }
            }
            coluna++;
        }
    }

    public void removerTodosVertice() {
        while (vertices.getPrimeiro() != null) {
            vertices.setPrimeiro(vertices.getPrimeiro().getNext());
        }
    }

    public String procurarEstacionamento() {
        Node auxiliar = vertices.getPrimeiro();
        while (auxiliar.getConteudo().getTipo().compareToIgnoreCase("estacionamento") != 0 && auxiliar != null) {
            auxiliar = auxiliar.getNext();
        }
        if (auxiliar != null) {
            return auxiliar.getConteudo().getNome();
        }
        return null;
    }

    private void salvarRota(String pontoChegada, String pontoColeta,LinkedList2 caminho) {
        int tempoRota = rotaPartidaAColeta(pontoColeta,caminho);
        rotaColetaAChegada(tempoRota, pontoChegada, pontoColeta,caminho);
    }

    private int rotaPartidaAColeta(String pontoColeta,LinkedList2 caminho) {
        String estacionamento = this.procurarEstacionamento();
        int posicao = vertices.getPosicao(estacionamento);
        No aux4 = caminho.get(posicao);
        int tempoRota = caminho.get(posicao).getConteudo().getPeso();
        rota = estacionamento;
        while (aux4.getConteudo().getDestino().getNome().compareToIgnoreCase(pontoColeta) != 0) {
            rota = rota.concat("," + aux4.getConteudo().getDestino().getNome());
            posicao = vertices.getPosicao(aux4.getConteudo().getDestino().getNome());
            aux4 = caminho.get(posicao);
        }
        rota = rota.concat("," + aux4.getConteudo().getDestino().getNome());
        return tempoRota;
    }

    private void rotaColetaAChegada(int tempoRota, String pontoChegada, String pontoColeta,LinkedList2 caminho) {
        int posicao = vertices.getPosicao(pontoChegada);
        No aux4 = caminho.get(posicao);
        tempoRota += caminho.get(posicao).getConteudo().getPeso();
        String invertida = "," + pontoChegada;
        while (aux4.getConteudo().getDestino().getNome().compareToIgnoreCase(pontoColeta) != 0) {
            String x = "," + aux4.getConteudo().getDestino().getNome();
            invertida = x.concat(invertida);
            posicao = vertices.getPosicao(aux4.getConteudo().getDestino().getNome());
            aux4 = caminho.get(posicao);
        }
        rota = rota.concat(invertida + "\nO tempo do trajeto é de " + tempoRota + " minutos");
    }

    public ArrayList listarTipodePontos(String tipoPonto) {
        Node auxiliar = vertices.getPrimeiro();
        ArrayList<String> lista = new ArrayList<>();
        while (auxiliar != null) {
            if (auxiliar.getConteudo().getTipo().compareToIgnoreCase(tipoPonto) == 0) {
                lista.add(auxiliar.getConteudo().getNome());
            }
            auxiliar = auxiliar.getNext();
        }
        return lista;
    }

    public ArrayList listarTodosPontos() {
        Node auxiliar = vertices.getPrimeiro();
        ArrayList<String> lista = new ArrayList<>();
        while (auxiliar != null) {
            lista.add(auxiliar.getConteudo().getNome());
            auxiliar = auxiliar.getNext();
        }
        return lista;
    }
}
