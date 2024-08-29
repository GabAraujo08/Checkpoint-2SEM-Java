package questao2;

public class Main {
    public static void main(String[] args) {
        GerenciadorConvidados gerenciador = new GerenciadorConvidados();

        gerenciador.adicionarConvidado("João");
        gerenciador.adicionarConvidado("Maria");
        gerenciador.adicionarConvidado("João"); //Adicionei novamente "João", aceitou mas não imprimiu
        gerenciador.imprimirConvidados();
    }
}
