import java.sql.Connection;
import java.sql.DriverManager;

// Classe responsável por gerenciar a conexão com o banco de dados
public class Conexao {
    // URL do banco de dados, usuário e senha
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_jdbc";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    // Método para estabelecer a conexão
    public static Connection conectar() {
        try {
            // Tenta se conectar ao banco de dados usando DriverManager
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            // Caso ocorra um erro, uma exceção é lançada com a mensagem de erro
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
}
