import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

// Classe para listar todos os registros da tabela
public class LerDados {
    public static void main(String[] args) {
        try (Connection conexao = Conexao.conectar()) {
            // SQL para selecionar todos os dados
            String sql = "SELECT * FROM usuarios";

            // Criação de um Statement para executar o SQL
            Statement stmt = conexao.createStatement();

            // Executa o comando e armazena os resultados
            ResultSet rs = stmt.executeQuery(sql);

            // Itera pelos resultados e exibe no console
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("------------");
            }
        } catch (Exception e) {
            // Imprime o erro caso ocorra
            e.printStackTrace();
        }
    }
}
