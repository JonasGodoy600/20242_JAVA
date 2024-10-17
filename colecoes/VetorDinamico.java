public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos; //refencia para vetor referente de inteiro
    private static final int CAPACIDADE_MINIMA = 4; //variavel de classe pelo static e inalteravel pelo final
    
    public void adicionar(int e){
        if(estaCheio()){    //verificar se o vetor esta cheio se estiver chamado para aux com o dobro de elementos 
            redimencionar(2);
        }
        elementos[qtde++] = e;
        
    }
    private void redimencionar(double fator){
        int [] aux;
        aux = new int [(int) (cap * fator)];
        for(var i = 0; i < qtde; i++){
            aux[i] = elementos[i];
        }
        cap = (int) (cap * fator);
        elementos = aux;

    }

    private void aumentarCapacidade(){
            int [] aux;
            aux = new int [cap*2];
            for(var i = 0; i < qtde; i++){
                aux[i] = elementos[i];
            }
            cap = cap * 2;
            elementos = aux;

    }

    private void reduzirCapacidade(){
        //vetor auxliar
        //copiar todo mundo para o aux
        if(estaUmQuartoCheio()){
            int [] aux;
            aux = new int[cap/2];
            for (int i =0; i < qtde; i++){
                aux[i] = elementos[i];
            }
            cap = cap / 2;
            elementos = aux;
        }
    }

    public void remover(){
        // se não esta vazio remova
        if (!estaVazio()){
            qtde--;
            
        }
        if (estaUmQuartoCheio() && cap > CAPACIDADE_MINIMA){
            redimencionar(0.5);
        }
    }

    public boolean estaVazio(){
        return qtde == 0;
    }

    private boolean estaUmQuartoCheio(){
        return qtde <= cap * 4;
    }

    public boolean estaCheio(){
        return qtde == cap;
        // return qtde == cap ? true : false;
        // if(qtde == cap)
        // return true;
        // return false;
    }

    public VetorDinamico(int cap){
        if(cap >= 4){
            elementos = new int[cap];
            this.cap = cap;
        }else{
            elementos = new int[4];
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

    public static void main(String[] args) {
        
    }
}
