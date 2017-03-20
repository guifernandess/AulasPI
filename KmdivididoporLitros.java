
import java.util.Scanner;


public class KmdivididoporLitros {
    public static void main(String[] args) {
        double km;
        double l;
        double processo;
        
        Scanner console = new Scanner (System.in);
        System.out.print("Digite a sua Quilometragem percorrida:");
        km = console.nextInt();
        System.out.print("Digite a qauntidade de gasolina(litros):");
        l = console.nextInt();
        processo = (km/l);
        System.out.println("Seu Km por litro: "+processo);
        
       
  
    }
    
            }
    
