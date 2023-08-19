import entities.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira o número da sua conta:");
        Integer numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, insira sua agência com dígito(XXX-X):");
        String agencia = sc.nextLine();

        System.out.println("Por favor insira seu nome:");
        String nome = sc.nextLine();

        System.out.println("Por favor insira seu saldo:");
        Double saldo = Double.parseDouble(sc.nextLine());

        ContaBanco contaBanco = new ContaBanco(numero, agencia, nome, saldo);
        System.out.println("Olá " + contaBanco.getNome()+ ", obrigado por criar uma conta em nosso banco, sua agência é " + contaBanco.getAgencia() +", conta "+contaBanco.getNumero()+" e seu saldo "+contaBanco.getSaldo()+" já está disponível para saque");
        sc.close();
    }
}
