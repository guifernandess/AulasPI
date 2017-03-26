
package exerciciospi;

import java.util.Scanner;



public class CarreiraPromocao {

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
        System.out.println("O funcionário(a) " + func + " trabalhou " + quantidadeHoras + " horas por " + valorHora + " e deve receber " + total);
        switch (nivel) {
            case 1:
                totalcompromocao = (valorHora * 15.0);
                break;
            case 2:
                totalcompromocao = (valorHora * 18.0);
                break;
            case 3:
                totalcompromocao = (valorHora * 22.0);
                break;
            case 4:
                totalcompromocao = (valorHora * 27.0);
                break;
            case 5:
                totalcompromocao = (valorHora * 33.0);
                break;
            default:
                System.out.println("Favor inserir o nível correto");
                break;
                
         }
        System.out.println("O funcionário(a) " + func + " trabalhou " + quantidadeHoras + " horas por " + valorHora + "(Nivel " + nivel + ") e deve receber " + totalcompromocao);
        if (nivel > 0 && nivel <= 5) {
            System.out.println("O funcionário(a) " + func + " teve promoção, trabalhou " + quantidadeHoras + " horas por " + valorHora + "(Nivel " + nivel + ") e seu novo salário é de " + totalcompromocao);
            System.out.printf("O funcionário(a) %s  trabalhou %2f horas por %2f e deve receber %2f", func,quantidadeHoras, valorHora, total);
        
        } else {
            System.out.println("Nível não encontrado na tabela");
       
        
    }
    }}