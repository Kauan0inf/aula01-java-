import java.util.Scanner;

public class Atividade18 {
 //Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em
 //Fahrenheit. Sabe-se que F = 180*(C + 32)/100.  
    public static void main(String[] args) { 
      Scanner entrada = new Scanner(System.in);
      double cel, fah;
      //Declaração de variaveis
      System.out.print("informe o valor em Celsius: ");
      cel = entrada.nextDouble();
      //Entrada de dados 
      fah = 180 * (cel + 32) / 100;
      //Processamento de dados
      System.out.print( "A temperatura em Celsius para Fahrenheit será : " + fah);
       entrada.close();
     //Saida de dados
    



    }
}
