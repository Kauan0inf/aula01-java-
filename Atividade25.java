import java.util.Scanner;
public class Atividade25 {
     
     public static void main(String[] args) { 
     Scanner entrada = new Scanner(System.in);  
     double valorHora, valorMinuto, valorSegundos, totalMinutos, horasMinutos;
     //Declaração de vriaveis 
     System.out.print("Informe a Hora para a conversão: ");
     valorHora = entrada.nextDouble();
     System.out.print("Informe os Minutos para a conversão: ");
     valorMinuto = entrada.nextDouble();
     //Entrada de dados 
     horasMinutos = valorHora * 60;
     totalMinutos = valorMinuto + horasMinutos;
     valorSegundos = totalMinutos * 60;   
     //Processamento de dados 
     System.out.println("A converção de Horas para Minutos é;" + valorMinuto);
     System.out.println("A converção de Minutos para Segundos é;" + valorSegundos);
       entrada.close();
     //Saida de dados




     }
    }