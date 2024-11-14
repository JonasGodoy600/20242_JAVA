//data access object
public class PessoaDAO {
    public void cadastrar(Pessoa p) throws Exception{

        //1 especificar o comando SQL (INSERT)
        var sql = 
           "INSERT INTO tb_pessoa(nome, fone, email) VALUES(?, ?, ?)";
        //2 estabelecer uma conexão com o bd
        var conexao = ConnectionFactory.conectar();
        //3 preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4 substituir os eventuais placeholders
        ps.setString(1,p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3,p.getEmail());
        //5 executar o comando
        ps.execute();
        //6 fechar a conexão
        ps.close();
    }

    public void apagar(Pessoa p) throws Exception{
        var sql = 
           "DELETE FROM tb_pessoa WHERE codigo = ?";
            var conexao = ConnectionFactory.conectar();

            var ps = conexao.prepareStatement(sql);

            ps.setInt(1,p.getCodigo());

            ps.execute();

            ps.close();

    }
}
