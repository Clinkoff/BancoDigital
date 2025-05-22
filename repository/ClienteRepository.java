import java.util.HashMap;
import java.util.Map;

public class ClienteRepository {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void salvar(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarPorCpf(String cpf) {
        return clientes.get(cpf);
    }
}