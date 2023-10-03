 import java.util.Scanner;
public class Atividade24 {
     
     public static void main(String[] args) { 
     Scanner entrada = new Scanner(System.in);  
     double reaisR$, dolar$, marco$, libra$;
     System.out.print("Informe a quantidade em reaisR$ para a conversões : ");
     reaisR$ = entrada.nextDouble();
     //Entrada de dados
     dolar$ = reaisR$ / 1.80;
     marco$ = reaisR$ / 2;
     libra$ = reaisR$ / 3.57;
     //Processamento de dados
     System.out.println("A conversão de reaisR$ para dolar$ sera: " + dolar$);
     System.out.println("A conversão de reaisR$ para marco$ sera: " + marco$);
     System.out.println("A conversão de reaisR$ para libra$ sera: " + libra$);
     entrada.close();
     //Saida de dados





     }
    }