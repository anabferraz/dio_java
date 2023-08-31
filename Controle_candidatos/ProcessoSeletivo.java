package Controle_candidatos;
import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main (String [] args){
        Candidato x = new Candidato();
        System.out.println("Processo seletivo XPTO: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        x.nome = scan.nextLine();
        System.out.println("Digite sua pretensão salarial: ");
        x.salarioPret = scan.nextDouble();

        x.analisar_Candidato(x.salarioPret,x.nome);
    }
    
    
}
