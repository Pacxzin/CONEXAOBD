import java.sql.Connection;
import java.sql.PreparedStatement;

// Classe para deletar registros no banco de dados
public class DeletarDados {
    public static void main(String[] args) {
        try (Connection conexao = Conexao.conectar()) {
            // SQL para deletar dados
            String sql = "DELETE FROM usuarios WHERE id = ?";

            // Preparação do comando SQL
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // Define o ID do registro a ser deletado
            stmt.setInt(1, 1);

            // Executa o comando SQL
            stmt.executeUpdate();

            // Exibe mensagem de sucesso
            System.out.println("Dados excluídos com sucesso!");
        } catch (Exception e) {
            // Imprime o erro caso ocorra
            e.printStackTrace();
        }
    }
}
