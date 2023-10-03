import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) { 
      //Faça um programa que calcule e mostre a área de um trapézio.
      //Sabe-se que: A = ((base maior + base menor) * altura)/2
      Scanner entrada = new Scanner (System.in);
      double baseMaior, baseMenor, area, altura;
      //Declração de variaveis 
      System.out.print( "Informe a base maior: ");
      baseMaior = entrada.nextDouble();
      System.out.print( "Informe a base menor: ");
      baseMenor = entrada.nextDouble();
      System.out.print( "Informe a altura: ");
      altura = entrada.nextDouble(); 
      //Entrada de dados
      area = ((baseMaior + baseMenor) * altura) / 2;
      //Processamento de dados
      System.out.print( "A área do trapézio: " + area);
      entrada.close();
      //Saida de dados 
    }
}  