import java.util.Scanner;

public class Atividade01{
    //Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo
   //segundo
    public static void main(String[] args){
 
     Scanner entrada = new Scanner(System.in);
     double res, num1, num2;
     //Declaração de Variaveis 
     System.out.print("Informe o primeiro número: "); 
     num1 = entrada.nextDouble();
     System.out.print("Informe o segundo número: ");
     num2 = entrada.nextDouble();
     //Entrada de dados
     res = num1 - num2;
     //Processamento de dados
     System.out.println("A subtração do primeiro pelo segundo vale: " + res); 
     entrada.close();
     //Saida de dados
    }
}   