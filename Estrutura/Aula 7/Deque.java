public class Deque<T>{
    private NoDuplo<T> primeiroNo; 
    private NoDuplo<T> ultimoNo;
    private String nomeDeque;
    private int tamanho;
    
    public Deque(String nomeDeque){
        this.nomeDeque = nomeDeque;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeDeque = nomeDeque;
        this.tamanho = 0;
    }
	
	public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            tamanho++;
            atualizaIndice();
            return;
        }else{
            novoNo.sextProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);  
            primeiroNo = novoNo;

        }
        atualizaIndice();        
        tamanho++;
    }
public void addfinal(T dado){
    NoDuplo<T> novoNo = new NoDuplo<T>(dado);
    if(ultimoNo == null){
        primeiroNo = novoNo;
        ultimoNo = novoNo;
      
    }else{
        ultimoNo.sextProximoNo(novoNo);
        novoNo.setAnteriorNo(ultimoNo);
        ultimoNo = novoNo; 
        }
        novoNo.setIndice(tamanho);
        tamanho++;
    }   
    public T removeInicio(){
        if(primeiroNo == null){
            System.out.println("Deque Vazio");
            return null;
        }else{
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();
            primeiroNo = primeiroNo.getProximoNo();
           
            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);    
        }else{
            ultimoNo = null;
        }
            atualizaIndice();
            tamanhodadoTemp
            return dadoTemp;
        }
        
    }
    public T removeFinal(){
     if(primeiroNo == null){
            System.out.println("Deque Vazio");
            return null;
        }else{
            T dado = ultimoNo.getDado();
            ultimoNo = ultimoNo.getAnteriorNo();

            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
             
        }else{
            primeiroNo = null;
        }
            tamanho--;
            return dadoTemp;
        }   
        public T peekInicio(){
            if(primeiroNo == null){
                System.out.println("Deque Vazio");
                return null;
            }
            return primeiroNo.getDado();
        }

        public void atualizaIndice(){
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }
    public int tamanhoDeque(){
        return tamanho;
    }
}
