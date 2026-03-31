package util;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    public double pedirValorImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel (positivo): ");
            valor = scanner.nextDouble();
            if (valor <= 0) System.out.println("Erro: O valor deve ser positivo.");
        } while (valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Digite o prazo em anos (positivo): ");
            prazo = scanner.nextInt();
            if (prazo <= 0) System.out.println("Erro: O prazo deve ser positivo.");
        } while (prazo <= 0);
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa;
        do {
            System.out.print("Digite a taxa de juros anual (positiva, ex: 10): ");
            taxa = scanner.nextDouble();
            if (taxa <= 0 || taxa > 500) System.out.println("Erro: Digite uma taxa válida (0 a 500).");
        } while (taxa <= 0 || taxa > 500);
        return taxa;
    }
}
