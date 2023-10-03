import java.util.Scanner;

public class Atividade08 {
    //Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas. 
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    double peso, pesoGramas;
    //Declaração de variaveis 
    System.out.println( "Informe seu peso: ");
    peso = entrada.nextDouble();
    //Entrda de dados  
    pesoGramas = peso * 1000;
    //Processamento de dados
    System.out.print("A média ponderada dessas notas: " + pesoGramas);
    entrada.close();
     }
    }


   