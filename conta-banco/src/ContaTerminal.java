import java.util.Locale;
import java.util.Scanner;

/**
 * Esta classe permite a criação de uma conta bancária fictícia à partir de dados fornecidos pelo usuário no terminal.
 */
public class ContaTerminal {

    /**
     * O método principal que inicia a execução do programa.
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            // Solicita e obtém o nome do cliente
            System.out.println("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            // Solicita e obtém o número da agência
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();

            // Solicita e obtém o número da conta
            System.out.println("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();

            // Solicita e obtém o saldo
            System.out.println("Por favor, digite o saldo: ");
            double saldo = scanner.nextDouble();

            // Exibe as informações inseridas pelo usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            // Em caso de exceção, exibe uma mensagem de erro genérica
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close(); // Fecha o scanner no final, independentemente de exceções
        }
    }
}
