import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o nome da sua agência: ");
        String agencia = scanner.nextLine();
     
        System.out.println("Digite o número da agência: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo disponivel: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
        scanner.close();
    }
}
