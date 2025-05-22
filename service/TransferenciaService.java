public class TransferenciaService {
    public void transferir(Conta origem, Conta destino, double valor) throws Exception {
        origem.transferir(destino, valor);
    }
}