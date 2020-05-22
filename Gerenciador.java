public class Gerenciador {
    FilaDinamica filaDinamica = new FilaDinamica();
    PilhaDinamica pilhaDinamica = new PilhaDinamica();
    void inserirNoticia(String noticia) {
        filaDinamica.inserir(noticia);
        pilhaDinamica.inserir(noticia);
    }
    void imprimirRecentes() {
        pilhaDinamica.imprime();
    }
    void imprimirAntigos() {
        filaDinamica.imprime();
    }
}
