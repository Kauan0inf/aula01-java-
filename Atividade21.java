 import java.util.Scanner;  
public class Atividade21 {
//. Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número
//de horas extras trabalhadas, calcule e mostre o salário a receber, de acordo com as regras a seguir:
//a) a hora trabalhada vale 1/8 do salário mínimo;
//b) a hora extra vale 1/4 do salário mínimo;
//c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//d) a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor
//da hora extra;
//e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras.
   public static void main(String[] args) { 
      Scanner entrada = new Scanner(System.in);
      double horasT, valorSm, horasExtras, salReceber;
      //Declaração variaveis
      System.out.print(" Informe o número de horas trabalhadas: ");
      horasT = entrada.nextDouble();
      System.out.print(" Informe o valor do Salário minimo: ");
      valorSm = entrada.nextDouble();
      System.out.print(" Informe as horas extras trabalhadas: ");
      horasExtras = entrada.nextDouble();
      //Entrada de dados 
      horasT = (horasT * valorSm) / 8.0;
      horasExtras = (horasExtras * valorSm) / 4.0;
      salReceber = valorSm  + horasExtras;
      //Processamento de dadoa 
      System.out.print( "O valor do seu salário será : " + salReceber);
      entrada.close();
      //Saida de dados
    }
}



