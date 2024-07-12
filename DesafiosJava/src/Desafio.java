import java.util.Scanner;

public class Desafio {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner leitorDeEntrada = new Scanner(System.in);

    System.out.println("Qual valor do seu salario: ");
    float valorSalario = leitorDeEntrada.nextFloat();

    System.out.println("Qual valor do seu beneficio: ");
    float valorBeneficio = leitorDeEntrada.nextFloat();

    float valorImposto = 0;

    if(valorSalario >= 0 && valorSalario <= 1100) {
      //Atribui a aliquota de 5% mediante o salário
      valorImposto = 0.05F * valorSalario;
    }else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
      //Atribui a aliquota de 10% mediante o salário
      valorImposto = 0.10f * valorSalario;
    }else{
      //Atribui a aliquota de 15% mediante o salário
      valorImposto = 0.15f * valorSalario;
    }
    float saida = valorSalario - valorImposto + valorBeneficio;
    System.out.println(String.format("O valor a ser pago é:" + saida));
  }
}