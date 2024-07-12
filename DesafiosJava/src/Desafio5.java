import java.util.Scanner;

public class Desafio5 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    double limiteDiario = scanner.nextDouble();
    double saque = 0;
    //Crie um loop 'for' para iterar sobre os saques:
    for (double i = saque; limiteDiario > i; limiteDiario -= i) {
      //Solicite ao usuário o valor do saque:
      saque = scanner.nextDouble();
      // Verifique se o valor do saque é zero, encerrando as transações:
      // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o
      // limiteDiario;
      if (saque == 0) {
        System.out.println("Transacoes encerradas.");
        return;
      } else {

        //Se o valor do saque não ultrapassar o limite diário, subtraia o valor
        // do saque do limite diário:
        if (saque <= limiteDiario) {
          limiteDiario -= saque;
          System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
        } else {

          //Informe que o saque foi realizado e mostre o limite restante:
          System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
          return;
        }
      }
    }
    // Fechamos o Scanner para evitar vazamento de recursos:
    scanner.close();
  }
}
