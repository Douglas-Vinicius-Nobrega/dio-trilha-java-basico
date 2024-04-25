import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);

            System.out.println("Por favor, digite seu nome: ");
            String nome = scan.next();
            
    
            System.out.println("Qual é o número da sua agência? ");
            String agencia = scan.next();
    
            System.out.println("Qual é o número da sua conta?");
            Integer conta = scan.nextInt();
    
            Double saldo = 237.48;
    
            System.out.println(
                    "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
