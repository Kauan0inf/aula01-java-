import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) { 
      Scanner entrada = new Scanner (System.in);
      double lado, area;
      //Declração de variaveis 
      System.out.print( "Informe o lado: ");
      lado = entrada.nextDouble();
      //Entrada de dados 
      area = lado * lado;
      //Processamento de dados
      System.out.println( "A área do quadrado é igual a: " + area);
       entrada.close();
      //Saida de dados 
      }
}