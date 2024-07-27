package Banco;

public class App {
  public static void main(String[] args) {
    Cliente Eduardo = new Cliente();
    Eduardo.setNome("Eduardo");
    Eduardo.setCpf(123456789);

    Cliente Marcio = new Cliente();
    Marcio.setNome("Marcio");
    Marcio.setCpf(987654321);

    Conta contaCorrente = new ContaCorrente(Eduardo, Eduardo);
    contaCorrente.depositar(100);

    Conta contaPoupanca = new ContaPoupanca(Marcio, Marcio);
    contaPoupanca.depositar(300);

    contaCorrente.transferir(1000, contaPoupanca);

    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();
  }
}
