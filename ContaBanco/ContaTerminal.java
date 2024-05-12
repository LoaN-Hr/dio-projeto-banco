package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Seja Bem-Vindo!! Vamos começar -------------------------");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Nome do Cliente:");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá," + cliente + "obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + conta + " e seu saldo é de R$" + saldo + " ,Ja está disponivel disponivel para saque!!!");
        scanner.close();
    }
}
