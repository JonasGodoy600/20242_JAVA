public class VetorDinamico <T> {
    private int qtde;
    private int cap;
    private T [] elementos;
    private static final int CAPACIDADE_MINIMA = 4;
 
    public void adicionar(T e){
        if (estaCheio()){
            //aumentarCapacidade();
            redimensionar(2);
        }
        elementos[qtde++] = e;
   
    }
 
    private void redimensionar(double fator){
        T[] aux;
        //aux = new T[(int)(cap * fator)];
        aux = (T[]) new Object[(int)(cap * fator)];
        for(int i = 0; i < qtde; i++){
            aux[i] = elementos[i];
        }
        cap = (int)(cap * fator);
        elementos = aux;
    }
    public void remover(){
        if(!estaVazio()){
            qtde--;
        }
        if(estaUmQuartoCheio() && cap > CAPACIDADE_MINIMA){
            redimensionar(0.5);
        }
    }
    public boolean estaVazio(){
        return qtde == 0;
    }
 
    public boolean estaUmQuartoCheio(){
        return qtde <= cap / 4;
    }
   
    public boolean estaCheio(){
        return qtde == cap;
        //return qtde == cap ? true : false;
        //if(qtde == cap)
           //return true;
        //return false;
    }
 
    public VetorDinamico(int cap){
        if(cap >= 4){
            elementos = (T[]) new Object[cap];
            this.cap = cap;
        }else{
            elementos = (T[]) new Object[4];
            this.cap = 4;
        }
        //elementos = cap >= 4 ? new int[cap] : new int[4];
       
    }
 
    public String toString(){
        //qtde: 2, cap: 4
        //5 4
        var sb = new StringBuilder("");
        sb.append("qtde:").append(qtde).append(", cap: ").append(cap).append("\n");
        for(var i = 0; i < qtde; i++)
            sb.append(elementos[i]).append(" ");
        return sb.toString();
    }
}