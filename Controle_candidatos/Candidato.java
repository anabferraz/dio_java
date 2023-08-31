package Controle_candidatos;

public class Candidato {

    public String nome;
    public double salarioPret;

    static void analisar_Candidato(double salarioPret, String nome){
        double salarioBase = 2000.00;
        if (salarioBase>salarioPret){
            System.out.println("Ligar para x candidatx "+nome);
        }else if (salarioBase==salarioPret){
            System.out.println("Ligar para x candidatx com contra proposta");
        }
        else {
            System.out.println("Aguardar resultado dos demais candidatos.");
        }
    }
}
