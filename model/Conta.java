public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) throws Exception {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }
}