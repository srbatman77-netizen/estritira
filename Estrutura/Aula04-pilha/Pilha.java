public class Pilha<T> {
    private No<T> topo;
private String nomePilha;   

    public Pilha() {
        this.topo = null;
    }

    public void push(T elemento) {
        No<T> novoNo = new No<>(elemento);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T elemento = topo.getPilha();
        topo = topo.getNextNo();
        return elemento;
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }
        return topo.getPilha();
    }

    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        No<T> noAtual = topo;

        while (noAtual != null) {
            retorno.append(noAtual).append("\n");
            noAtual = noAtual.getNextNo();
        }

        return retorno.toString();
    }
}