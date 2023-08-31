package Projeto_java_basico_dio;

public class Cliente {

    public int agencia;
    public String conta;
    public String nome;
    public float saldo;

    public void print_values(){
        System.out.println("Olá, "+nome+"! Obrigadx por escolher o banco Itaú para abrir sua conta!\nSua agência é "+agencia+", conta "+conta+" e seu saldo é de R$ "+saldo+". Ele já está disponível para futuras transações ;)");
    }
    
}
