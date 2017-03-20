
package teste;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Calcularidade {
   
    public static void main(String[] args) { 
        int idade;
        int a = 2017;
        Scanner leitor  = new Scanner(System.in);
        
               
        System.out.println("Bem vindo ao Teste, "+"Amigos.");
        System.out.print("Para começarmos, por favor digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println("Você nasceu em: "+(a-idade));
     
        
    
}
