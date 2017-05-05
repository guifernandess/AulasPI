package aulapi0405;

import java.util.Scanner;

public class AulaPI0405 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n1 = lerNumero();
        double n2 = lerNumero();

        boolean numerovalido = false;
        do {
            try {
                System.out.println("N1:");
                n1 = Double.parseDouble(console.nextLine());
                numerovalido = true;
            } catch (NumberFormatException ex) {
                System.out.println("Número inválido");
            }
        } while (!numerovalido);

        do {
            try {

                System.out.println("N2:");
                n2 = Double.parseDouble(console.nextLine());
                numerovalido = true;
            } catch (NumberFormatException ex) {
                System.out.println("Número inválido");
            }
        } while (!numerovalido);

        double resultado = soma(n1,n2);

        System.out.println("Resultado = " + resultado);

    }
    
   public static double soma (double a, double b) {
       
   return a + b;
   }
 public static double lerNumero(){
     Scanner console = new Scanner (System.in);
    boolean numerovalido = false;
    double n =0;
     do {
     try {
     System.out.println("Numero 1: ");
     n = Double.parseDouble(console.nextLine());
     numerovalido = true;
     } catch (NumberFormatException ex) {
         System.out.println("Número inválido");
         
     }
     } while (!numerovalido);
 return n;
}}

