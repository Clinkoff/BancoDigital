public class Aplicacao {
    public static void main(String[] args) throws Exception {
        ClienteRepository clienteRepo = new ClienteRepository();
        ContaRepository contaRepo = new ContaRepository();

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        clienteRepo.salvar(cliente1);
        clienteRepo.salvar(cliente2);

        Conta conta1 = new ContaCorrente("0001", cliente1);
        Conta conta2 = new ContaPoupanca("0002", cliente2);

        contaRepo.salvar(conta1);
        contaRepo.salvar(conta2);

        ContaService contaService = new ContaService();
        TransferenciaService transferenciaService = new TransferenciaService();

        try {
            contaService.depositar(conta1, 1000.00);
            contaService.sacar(conta1, 200.00);
            transferenciaService.transferir(conta1, conta2, 300.00);

            System.out.println("Saldo João: R$" + contaService.consultarSaldo(conta1));
            System.out.println("Saldo Maria: R$" + contaService.consultarSaldo(conta2));

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}