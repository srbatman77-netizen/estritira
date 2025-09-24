public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;
    private int indice;

    public NoDuplo(T dado, int indice){
        this.dado = dado;
        this.indice = indice;
        this.anteriorNo = null;
        this.proximoNo = null;
    }

        public T getDado(){
            return this.dado;
        }
    
        public void setDado(T dado){
            this.dado = dado;
        }
        
        public NoDuplo getProximoNo(){
            return this.proximoNo;

        }

        public void setProximoNo(NoDuplo<T> anteriorNo){
            this.anteriorNo = anteriorNo;
        }

        public getIndice(){
            return this.indice = indice;
        }

        public String toString(){
            return "{indice: " + getIndice() + "Dado "}; + getDado() + "}";     
        }
}