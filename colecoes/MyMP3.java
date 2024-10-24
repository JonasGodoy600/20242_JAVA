import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class MyMP3 {
    public static void main(String[] args) {
        var musicas = new ArrayList<Musica>();
        //1 - cadastrar musica
        //2 - visualizar a lista de musicas
        //3 - remover musica
        //0 - sair
        int op;
        var menu =
            "1 - Cadastrar Música\n2 - Listar Músicas\n3 - Remover Músicas\n0 - Sair";
        do { 
            op = parseInt(showInputDialog(menu));
            switch(op){
                case 1:{
                    var titulo = showInputDialog("TItulo?");
                    var musica = new Musica(titulo);
                    musicas.add(musica);
                    showMessageDialog(null, "Musica Adicionada!");
                    break;     
                }


                case 2:
                {
                if (!musicas.isEmpty()) {
                    var sb = new StringBuilder("");
                    
                    for (var m : musicas){
                        sb.append(m.getTitulo()).append("\n");
                    }
                    showMessageDialog(null, sb.toString());

                }
                break;
            }

                case 3: 
                {
                    var titulo = showInputDialog("Titulo para Exclusao");
                    
                    musicas.remove(new Musica(titulo));
                    
    
                    break;
                }



                case 0:
                showMessageDialog(null, "Até Mais");
                break;


                default:
                showMessageDialog(null, "Opção não disponivel");
                break;
            }

        } while (op != 0);
    }
}