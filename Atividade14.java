import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
      //Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
     //a) a idade dessa pessoa em anos;
     //b) a idade dessa pessoa em meses;
     //c) a idade dessa pessoa em dias;
     //d) a idade dessa pessoa em semanas. 
      Scanner entrada = new Scanner (System.in);
      int  anoAtual, anoNasc, anos, meses , dias , semanas;
      //Declração de variaveis 
      System.out.print( "Informe o ano atual: ");
      anoAtual = entrada.nextInt();
      System.out.print( "Informe o ano em que voce nasceu: ");
      anoNasc = entrada.nextInt();
      //Entrada de daados
      anos = anoAtual - anoNasc;
      meses = anos * 12;
      dias = anos * 365;
      semanas = anos * 52;
      //Processamento de dados 
      System.out.println( "A sua idade é: " + anos);
      System.out.println( "A sua idade em Meses é: " + meses);
      System.out.println( "A sua idade em Dias é: " + dias);
      System.out.println( "A sua idade em Semanas é: " + semanas);
       entrada.close();
      //Saida de dados
    }
}  