
package exerciciospi;

import java.util.Scanner;

public class FuncionarioeSalario {
       public static void main(String[] args) {

        double  horastrab, valorhora, salario;
        String nomefunc;

           Scanner console = new Scanner (System.in);
           System.out.print("Digite o nome do Funcinário: ");
           nomefunc = console.next();
           System.out.print("Insira as horas trabalhadas: ");
           horastrab = console.nextDouble();
            System.out.print("Insira o valor por hora: ");
            valorhora = console.nextDouble();
           
           
        salario = horastrab * valorhora;

        System.out.println("O funcionário "+nomefunc+" trabalhou "+horastrab+" horas por R$ "+valorhora+" e deve receber R$ "+salario);

    }
}
