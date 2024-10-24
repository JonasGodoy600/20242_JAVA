import java.util.Random;
public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        //construir um vetor dinamico do tamanho 8
        //use o operador de inferencia de tipo
        var teste = new VetorDinamico(4);
        var gerador = new Random();
        //loop infinito com while
        while (true){
            var valor =  gerador.nextInt(10) + 1;
            var oQueFazer = gerador.nextDouble();
            if(oQueFazer <= 0.5){
                teste.remover();
                System.out.println("Removendo: ");
            }
            else {
                teste.adicionar(valor);
                System.out.println("Adicionando: ");

            }
            //adicionar
            System.out.println(teste);
            System.out.println("======================");
            //dormir por 5 segundos
            Thread.sleep(3000);
        }
    }
}
