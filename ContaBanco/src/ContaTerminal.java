import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agencia: ");
        agencia = teclado.next();

        System.out.println("Por favor, digite o número da conta: ");
        numero = teclado.nextInt();
        
        //Esvazia o buffer do teclado 
        teclado.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = teclado.nextLine();

        System.out.println("teste:");
        saldo = teclado.nextDouble();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
