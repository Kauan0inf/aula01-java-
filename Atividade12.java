import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
      //Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule
      //e mostre a quantidade de salários mínimos que esse funcionário ganha.
      Scanner entrada = new Scanner (System.in);
      double qtdSalario, salarioRecebido, valorSalario;
      //Declração de variaveis
      System.out.print( "Informe o valor do salário minimo: ");
      valorSalario = entrada.nextDouble();
      System.out.print( "informe seu salário: ");
      salarioRecebido = entrada.nextDouble();
      //Entrada de dados  
      qtdSalario = salarioRecebido / valorSalario;
      //Processamento de dados 
      System.out.print( "O valor da converção é: " + qtdSalario );
      entrada.close();
      //Saida de dados
    }
}  
          