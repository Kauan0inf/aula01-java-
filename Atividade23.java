import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        //. Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre a medida do
        //terceiro ângulo. Sabe-se que a soma dos ângulos de um triângulo é 180 graus. 
         Scanner entrada = new Scanner(System.in);
         double primeiroAngulo, segundoAngulo, terceiroAngulo;
         //Declaração de variaveis
         System.out.print("Digite a medida do primeiro ângulo: ");
         primeiroAngulo = entrada.nextDouble();
         System.out.print("Digite a medida do segundo ângulo: ");
         segundoAngulo = entrada.nextDouble();
         //Entrada de dados
         terceiroAngulo = 180.0 - (primeiroAngulo + segundoAngulo);
         //Processamento de dados
         System.out.println("A medida do terceiro ângulo é: " + terceiroAngulo );
         entrada.close();
         //Saida de dados

    }
}
