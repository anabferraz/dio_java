package Projeto_java_basico_dio;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String []args){
        Cliente x = new Cliente();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da agência e, em seguida, aperte ENTER: ");
        x.agencia = scan.nextInt();
        System.out.println("Digite o número da conta com traço e dígito e, em seguida, aperte ENTER: ");
        x.conta = scan.nextLine();
        System.out.println("Digite o seu nome completo, em seguida, aperte ENTER: ");
        x.nome = scan.nextLine();
        System.out.println("Digite o seu saldo atual, em seguida, aperte ENTER: ");
        x.saldo = scan.nextFloat();
        x.print_values();
    }
}