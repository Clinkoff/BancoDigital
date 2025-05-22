public class ContaService {
    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void sacar(Conta conta, double valor) throws Exception {
        conta.sacar(valor);
    }

    public double consultarSaldo(Conta conta) {
        return conta.getSaldo();
    }
}
