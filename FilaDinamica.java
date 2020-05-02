

/**
 * @author
 * @author: Alexandre Roberto RA 21434418
 * @author: Jhonatan Lima Ra 21337942
 * @author: Emanuelle Fernandes de Macedo Pimenta 21433185
 */

public class FilaDinamica {
    No inicio;
    No fim;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
    }

    void imprime() {
        if (isEmpty()) {
            System.out.println("vazia");
        } else {
            No auxiliar = inicio;
            while (auxiliar != null) {
                System.out.println(auxiliar.dado);
                auxiliar = auxiliar.proximoNo;
            }
        }
    }

    boolean isEmpty() {
        return (inicio == null);
    }

    public void inserir(String dado) {
        No novoNo = new No(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximoNo = novoNo;
            fim = novoNo;
        }

    }

}
