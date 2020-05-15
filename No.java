/**
 * @author: Alexandre Roberto RA 21434418
 * @author: Igor Oliveira da Silva  RA 20926645
 * @author: Emanuelle Fernandes de Macedo Pimenta 21433185
 */

public class No {

    String dado;
    No proximoNo;

    public No(String dado) {
        this.dado = dado;
        this.proximoNo = null;
    }

    void inserir(String novoDado) {
        No novoNo = new No(novoDado);
        novoNo.proximoNo = null;
    }
}
