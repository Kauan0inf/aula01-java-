 
import java.util.Scanner;
import java.lang.Math;

public class Atividade20 {
     //Faça um programa que receba a medida do ângulo formado por uma escada apoiada no chão e a 
     //distância em que a escada está da parede, calcule e mostre a medida da escada para que se possa alcançar
     //sua ponta.
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         double angulo, distParede, comprEscada, anguloRadianos;
         //Declaração de variaveis
         System.out.print("Digite o ângulo formado pela escada em graus: ");
         angulo = entrada.nextDouble();
         System.out.print("Digite a distância da escada à parede em metros: ");
         distParede = entrada.nextDouble();
         //Entrada de dados
         anguloRadianos = Math.toRadians(angulo);
         comprEscada = distParede / Math.sin(anguloRadianos);
         //Processamento de dados
         System.out.println("A medida da escada necessária é: " + comprEscada + " metros");
         entrada.close();
         //Saida de dados
    }
}
