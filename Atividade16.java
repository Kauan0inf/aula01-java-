import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) { 
      //. Faça um programa que receba o valor dos catetos de um triângulo, calcule 
      //e mostre o valor da hipotenusa. 
      Scanner entrada = new Scanner(System.in);
      double cateto1, cateto2, hipotenusa;
      //Declaração de variaveis
      System.out.print("Informe o valor do primeiro cateto: ");
      cateto1 = entrada.nextDouble();
      //Entrada de dados cateto1
      System.out.print("Informe o valor do segundo cateto: ");
      cateto2 = entrada.nextDouble();
      //Entrada de dados cateto2
      hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
      //processamento de dados
      System.out.println( "a hipotenusa e igual a: "+ hipotenusa );
      entrada.close();
      //Saida de dados



    }


}
     