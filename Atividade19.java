 import java.util.Scanner;

public class Atividade19 {
    //Sabe-se que, para iluminar de maneira correta os cômodos de uma casa, para cada m2,
    //deve-se usar 18 W
    //de potência. Faça um programa que receba as duas dimensões de um cômodo (em metros), calcule e mostre
    //a sua área (em m2
    //e a potência de iluminação que deverá ser utilizada.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        double comodoLarg, comodoCompr, metros2, luzW;
        //Declaração de variaveis
        System.out.print("Informe a largura do cômodo em Metros: ");
        comodoLarg = entrada.nextDouble();
        System.out.print("Informe o comprimento do cômodo em Metros: ");
        comodoCompr = entrada.nextDouble();
        //Entrada de dados
        metros2 = comodoLarg * comodoCompr;
        luzW = metros2 * 18;
        //Processamento de dados 
        System.out.print(" A potência de luz que deverá ser ultilizada : " + luzW );
        entrada.close();
        //Saida de dados
       }
   }
   
