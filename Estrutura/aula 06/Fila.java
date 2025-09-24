public class Fila<T>{
    public  No<T> primeiroNo;
    public  No<T> ultimoNo;
    private String nomeFila;
    
    public Fila(){
        this("lista");
    }
    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo= null;
        this.ultimoNo = null;

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if (primeiroNo == null){
            primeiroNo == novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
      }

      public T desenfileirar(){
        if (primeiroNo == null){
            System.err.println("Fila " + nomeFila + "vazia!");

        } else {
            T dadoTemp = primeiroNo.getdado();
            primeiroNo = primeiroNo.getNextNo();
        }
        return dadoTemp;
      }

    
    }
}