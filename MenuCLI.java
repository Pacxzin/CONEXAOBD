import java.util.Scanner;

// Classe para criar uma interface de linha de comando (CLI) para o projeto
public class MenuCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Loop para exibir o menu até que o usuário escolha sair
        do {
            System.out.println("=== MENU JDBC ===");
            System.out.println("1. Inserir dados");
            System.out.println("2. Atualizar dados");
            System.out.println("3. Deletar dados");
            System.out.println("4. Ler dados");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Chama a funcionalidade escolhida pelo usuário
            switch (opcao) {
                case 1:
                    InserirDados.main(null);
                    break;
                case 2:
                    AtualizarDados.main(null);
                    break;
                case 3:
                    DeletarDados.main(null);
                    break;
                case 4:
                    LerDados.main(null);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5); // Sai do loop quando o usuário escolhe 5 (sair)

        scanner.close(); // Fecha o Scanner
    }
}
