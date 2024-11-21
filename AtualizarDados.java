import java.sql.Connection;
import java.sql.PreparedStatement;

// Classe para atualizar registros no banco de dados
public class AtualizarDados {
    public static void main(String[] args) {
        try (Connection conexao = Conexao.conectar()) {
            // SQL para atualizar dados
            String sql = "UPDATE usuarios SET nome = ? WHERE id = ?";

            // Preparação do comando SQL
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // Define os valores dos parâmetros
            stmt.setString(1, "João Santos"); // Novo nome
            stmt.setInt(2, 1); // ID do registro a ser atualizado

            // Executa o comando SQL
            stmt.executeUpdate();

            // Exibe mensagem de sucesso
            System.out.println("Dados atualizados com sucesso!");
        } catch (Exception e) {
            // Imprime o erro caso ocorra
            e.printStackTrace();
        }
    }
}
