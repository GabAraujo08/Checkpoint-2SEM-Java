package questao2;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorConvidados implements GerenciadorConvidadosInterface {
    Set<String> convidados = new HashSet<>();

    @Override
    public void adicionarConvidado(String nome) {
        convidados.add(nome);
    }

    @Override
    public void print() {
        for (String convidado : convidados) {
            System.out.println(convidado);
        }
    }
}
