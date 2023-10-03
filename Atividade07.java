import java.util.Scanner;

public class Atividade07 {
    //Faça um programa que receba o peso de uma pessoa, calcule e mostre:
   //a) o novo peso, se a pessoa engordar 15% sobre o peso digitado;
   //b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado. //
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double peso, pesoMais15, pesoMenos20;
       //Declaração de dados 
       System.out.print("Informe seu peso: ");
       peso = entrada.nextDouble();
       //Entrada de dados 
       pesoMais15 = (peso * 0.15) + peso;
       pesoMenos20 = peso * 0.20;
       //Processamento de dados 
       System.out.println("Seu peso mais 15% será :" + pesoMais15+ " kg. " );
       System.out.println("Seu peso menos 20% será :" + pesoMenos20+ " kg. " );
       entrada.close();










    }
}
