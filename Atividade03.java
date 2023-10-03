import java.util.Scanner;

 public class Atividade03 {
     //Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo
     //segundo. Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar
     //com validações. 
    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);
         double res, num1, num2; 
         //Declaração de variáveis
         System.out.print("Informe um número: ");
         num1 = entrada.nextDouble();
         System.out.print("Informe um número: ");
         num2 = entrada.nextDouble();
         //Entrada de dados 
         res = num1 / num2; 
         //Processamento de dados 
         System.out.print("A divisão do primeiro número pelo segundo número é " + res );
         entrada.close();
         //Saida de dados
    }
}
