 import java.util.Scanner;
public class Atividade15 {
     
     public static void main(String[] args) { 
      //João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso, ele deverá pagar
      //multa de 2% sobre cada conta. Faça um programa que calcule e mostre quanto restará do salário de
      //João
     Scanner entrada = new Scanner(System.in);  
     double salario, conta1, conta2, newSalario, acrescimo1, acrescimo2;
     //Declração de variaveis
     System.out.print("Informe seu salario: ");
     salario = entrada.nextDouble();
     System.out.print("Informe o valor da primeira conta: ");
     conta1 = entrada.nextDouble();
     System.out.print("Informe o valor da segunda conta: ");
     conta2 = entrada.nextDouble();
     //Entrada de dados
     acrescimo1 = conta1 * 0.02;
     acrescimo2 = conta2 * 0.02;
     newSalario = salario - (conta1 + acrescimo1) - (conta2 + acrescimo2);
     //Processamento de dados 
     System.out.print( "O que restará do seu salário: " + newSalario);
       entrada.close();
     //Saida de dados 
 

    }
}
