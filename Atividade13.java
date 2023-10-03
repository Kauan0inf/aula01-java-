
 import java.util.Scanner;

public class Atividade13 {
    //Faça um programa que calcule e mostre a tabuada de um número digitado pelo usuário. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        int numero = scanner.nextInt();
        //Entrda de dados
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++ ) {
        int resultado = numero * i;
        //Processamento de dados
        System.out.println(numero + " x " + i + " = " + resultado); }
        scanner.close();
        //Saida de dados
      } 
}
