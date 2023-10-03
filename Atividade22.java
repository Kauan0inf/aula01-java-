import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        //Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número
        //de diagonais desse polígono. Sabe-se que ND = N * (N − 3)/2, em que N é o número de lados do
        //polígono. 
        Scanner entrada = new Scanner(System.in);
        double numeroLados, numeroDiagonais;
        //Declaração de variaveis 
        System.out.print("Digite o número de lados do polígono convexo: ");
        numeroLados = entrada.nextDouble();
        //Entrada de dados
        numeroDiagonais = (numeroLados * (numeroLados - 3)) / 2;
        //Processamento de dados
        System.out.println("O número de diagonais do polígono convexo é: " + numeroDiagonais);
        entrada.close();
        //Saida de dados
    }  
}
