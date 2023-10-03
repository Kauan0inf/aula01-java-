 import java.util.Scanner;

public class Atividade05 {
    //Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se
    //que este sofreu um desconto de 10%. 
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 
       double price, newPrice;
       //Declaração de variaveis
       System.out.print("Informe o preço: ");
       price = entrada.nextDouble();
       //Entrada de dados 
       newPrice = price - (price * 10/100);
       //Processamento de dados 
       System.out.print("O novo preço: " + newPrice);
        entrada.close();
       //Saida de dados 
    }



}
