import java.sql.Connection;
import java.sql.PreparedStatement;

// Classe para inserir registros no banco de dados
public class InserirDados {
    public static void main(String[] args) {
        try (Connection conexao = Conexao.conectar()) {
            // SQL para inserção de dados
            String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

            // Preparação do comando SQL
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // Define os valores dos parâmetros
            stmt.setString(1, "João Silva");
            stmt.setString(2, "joao.silva@email.com");

            // Executa o comando SQL
            stmt.executeUpdate();

            // Exibe mensagem de sucesso
            System.out.println("Dados inseridos com sucesso!");
        } catch (Exception e) {
            // Imprime o erro caso ocorra
            e.printStackTrace();
        }
    }
}
