import java.util.HashMap;
import java.util.Map;

public class ContaRepository {
    private Map<String, Conta> contas = new HashMap<>();

    public void salvar(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarPorNumero(String numero) {
        return contas.get(numero);
    }
}
