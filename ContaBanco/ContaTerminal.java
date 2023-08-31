package ContaBanco;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String []args){
        Cliente x = new Cliente();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da agência e, em seguida, aperte ENTER: ");
        x.agencia = scan.nextInt();
        scan.nextLine();
        if (x.agencia != 0){
            System.out.println("Digite o número da conta com traço e dígito e, em seguida, aperte ENTER: ");
            x.conta = scan.nextLine();
            if (x.conta != ""){
                System.out.println("Digite o seu nome completo, em seguida, aperte ENTER: ");
                x.nome = scan.nextLine();
                if (x.nome != ""){
                    System.out.println("Digite o seu saldo atual, em seguida, aperte ENTER: ");
                    x.saldo = scan.nextFloat();
                }
                else {
                    System.out.println("Você precisa digitar um valor válido. Tente novemente!");
                }
            
            }
            else {
                System.out.println("Você precisa digitar um valor válido. Tente novemente!");
                }
        }



        x.print_values();
    }
}