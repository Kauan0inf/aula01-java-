import java.util.Scanner;

public class Atividade04 {
  //Faça um programa que receba duas notas, calcule e mostre a média 
  //ponderada dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda
     
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, mediaPonderada;
    //Declaração de variáveis
    System.out.print("Informe uma nota: ");
    nota1 = entrada.nextDouble();
    System.out.print("Informe uma nota: ");
    nota2 = entrada.nextDouble();
    //Entrada de dados
    mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;
    //Processamento de dados
    System.out.print("A média ponderada dessas notas: " + mediaPonderada);
    entrada.close();
     }
    }