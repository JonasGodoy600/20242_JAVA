import javax.swing.JOptionPane;
public class LivroDeNotas{
    //variável de instância
    private String nomeDisciplina = null;
    //método setter
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    //método de instância
    public void exibirMensagem(){
        //System.out.println("Bem vindo ao livro de notas");
        JOptionPane.showMessageDialog(null, String.format("Bem vindo ao livro de notas da disciplina %s", nomeDisciplina));
    }
}