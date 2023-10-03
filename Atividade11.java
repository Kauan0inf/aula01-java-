import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) { 
      Scanner entrada = new Scanner (System.in);
      double diagonalMaior, diagonalMenor, area, altura;
      //Declração de variaveis 
      System.out.print( "Informe a diagonal maior: ");
      diagonalMaior = entrada.nextDouble();
      System.out.print( "Informe a diagonal menor: ");
      diagonalMenor = entrada.nextDouble();
      System.out.print( "Informe a altura: ");
      altura = entrada.nextDouble();
      //Entrada de dado
      area = ((diagonalMaior + diagonalMenor) * altura) / 2;
      //Processamento de dados 
      System.out.print( "A área do trapézio: " + area);
      entrada.close();
      //Saida de dados
    }
}  