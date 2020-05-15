/**
 * @author: Alexandre Roberto RA 21434418
 * @author: Igor Oliveira da Silva  RA 20926645 
 * @author: Emanuelle Fernandes de Macedo Pimenta 21433185
 */

public class PilhaDinamica {
	No topo;

	public PilhaDinamica() {
		this.topo = null;
	}

	public void inserir(String dado) {
		No novoNo = new No(dado);
		novoNo.proximoNo = this.topo;
		this.topo = novoNo;

	}

	public String desempilha() {

		String messagePilhaVazia = "vacuuo";

		if (pilhaVazia()) {
			return messagePilhaVazia;
		} else {
			No auxiliar = this.topo;
			topo = auxiliar.proximoNo;
			return auxiliar.dado;
		}

	}

	boolean pilhaVazia() {
		return (this.topo == null);
	}

	void imprime() {
		if (pilhaVazia()) {
			System.out.println("Pilha vazia");
		} else {
			No auxiliar = this.topo;
			while (auxiliar != null) {
				System.out.println(auxiliar.dado);
				auxiliar = auxiliar.proximoNo;
			}
		}

	}

}
