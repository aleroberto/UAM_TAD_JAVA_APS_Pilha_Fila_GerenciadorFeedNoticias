public class FilaDinamica {
    No inicio;
    No fim;
    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
    }
    protected void imprime() {
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
    protected boolean isEmpty() {
        return (inicio == null);
    }
    protected void inserir(String dado) {
        No novoNo = new No(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximoNo = novoNo;
            fim = novoNo;
        }

    }
    protected String dequeue() {
        if(isEmpty()) {
            System.out.println("Nao ha itens");
        }
        No aux = inicio;
        inicio = inicio.proximoNo;
        if(inicio == null) {
            fim = null;
        }
        return aux.dado;
    }
}