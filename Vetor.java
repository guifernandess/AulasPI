
package aulapi0405;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double [] numeros = new double[4];
        for(int i =0; i <1000;i++) {
            System.out.println(i);
            numeros[i] = Double.parseDouble(console.nextLine());
            
        }
    }
}
