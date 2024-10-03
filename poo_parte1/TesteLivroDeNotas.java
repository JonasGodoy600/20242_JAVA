import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
    //a classe testelivrodenotas é dependente da classe livrodenotas, ou seja, é cliente da livrodenotas
    static public void main (String...args){
        //construir um livro de notas
        //java 10+: operador de inferência de tipo
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
        var meuLivro = new LivroDeNotas();
        //variável de instância é o mesmo que objeto
        meuLivro.setNomeDisciplina(disciplina1); 
        //acionar o comportamento sobre ele
        meuLivro.exibirMensagem();

        //construir um segundo livro de notas
        //e fazer com que ele exiba a mensagem
        var disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2");
        var meuLivro2 = new LivroDeNotas();
        meuLivro2.setNomeDisciplina(disciplina2);
        meuLivro2.exibirMensagem();
    }
}