import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados

        // Exibir a mensagem de conta criada

        Scanner nomecliente = new Scanner(System.in);
        System.out.println("Por favor digite seu nome: ");

        Scanner agencia = new Scanner(System.in);
        System.out.println("Por favor digite o número da sua agência: ");

        Scanner conta = new Scanner(System.in);
        System.out.println("Por favor digite o número da sua conta: ");

        Scanner saldo = new Scanner(System.in);
        System.out.println("Informe qual valor gostaria de depositar: ");

        System.out.println("Olá " + nomecliente + "," + "obrigado por criar sua conta em nosso banco, sua agência é " + agencia + "," + "conta " + conta + "e seu saldo disponivel é: " + saldo);
        

        


    }
}
