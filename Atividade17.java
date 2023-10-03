import java.util.Scanner;

public class Atividade17 {
    //Faça um programa que receba o raio, calcule e mostre:
    //a) o comprimento de uma esfera; sabe-se que C = 2 * p R;
    //b) a área de uma esfera; sabe-se que A = p R2
    //c) o volume de uma esfera; sabe-se que V = ¾ * p R3
    public static void main(String[] args) { 
      Scanner entrada = new Scanner(System.in);
      double valorRaio, comprimentoEsfera, areaEsfera, volumeEsfera;
      //Declaração de variaveis
      System.out.print("Informe o valor do Raio: ");
      valorRaio = entrada.nextDouble();
      //Entrada de dados 
      comprimentoEsfera = 2 * (3.14 * valorRaio);
      areaEsfera = 3.14 * (valorRaio * valorRaio);
      volumeEsfera = 3/4 * 3.14 * (valorRaio * valorRaio * valorRaio);
      //Processamento de dados
      System.out.println( "O comprimento da Esfera será: " + comprimentoEsfera );
      System.out.println( "O area da Esfera será: " + areaEsfera );
      System.out.println( "O volume da Esfera será: " + volumeEsfera );
       entrada.close();
     //Saida de dados 



    }
}
