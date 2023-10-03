import java.util.Scanner;

public class Atividade02 {
    //Faça um programa que receba três números, calcule e mostre a multiplicação desses números. 
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     double res, num1, num2, num3;
     //Declaração de variaveis 
     System.out.print("Informe o primeiro número: ");
     num1 = entrada.nextDouble(); 
     System.out.print("Informe o segundo número: ");
     num2 = entrada.nextDouble();
     System.out.print("Informe o terceiro número: ");
     num3 = entrada.nextDouble();
     //Entrada de dados 
     res = num1 * num2 * num3;
     //Processamento de dados 
     System.out.println("O resoltado da Multiplicação dos trés números será : " + res); 
     entrada.close();
     //Saida de dados


    }
}
