
package exerciciospi;
import java.util.Scanner;

public class PlanoCarreira {
public static void main(String[] args) {
        String func;
        double valorHora, total, quantidadeHoras, totalcompromocao = 0;
        int nivel;  
        
        Scanner console = new Scanner (System.in);
        
        System.out.print("Digite o nome do funcinário(a): ");
        
        func = console.next();
        System.out.print("Digito o nível de "+ func+": ");
        nivel = console.nextInt();
        System.out.print("Insira a quantidade de horas trabalhadas: ");
        quantidadeHoras = console.nextDouble();
        System.out.print("Insira o valor da hora trabalhada: ");
        valorHora = console.nextDouble();
        
        total = valorHora * quantidadeHoras;
        System.out.println("O funcionário(a) " + func + " trabalhou " + quantidadeHoras + " horas por " + valorHora +"(Nível "+nivel+")  e deve receber " + total);    
}
}