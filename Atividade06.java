import java.util.Scanner;

public class Atividade06 {
    //Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa
    //que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu
    //salário final.
    public static void main(String[] args) { 
       Scanner entrada = new Scanner(System.in);
       double salarioFixo, vendas, salarioTotal, valorC;
       //Declaração de variaveis 
       System.out.print("Informe o seu sálario: ");
       salarioFixo = entrada.nextDouble();
       System.out.print("Informe o valor de suas vendas: ");
       vendas = entrada.nextDouble();
       //Entrada de dados 
       valorC = vendas * 0.04;
       salarioTotal = valorC + salarioFixo;
       //Processamento de dados
       System.out.println("A sua comissão sera: " + valorC); 
       System.out.println("O Salário final sera: " + salarioTotal);
        entrada.close();
       //Saida de dados
       
        




    }

}
