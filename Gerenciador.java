/**
 * @author: Alexandre Roberto RA 21434418
 * @author: Igor Oliveira da Silva  RA 20926645 
 * @author: Emanuelle Fernandes de Macedo Pimenta 21433185
 */

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
