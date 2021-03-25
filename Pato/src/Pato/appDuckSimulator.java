
package pato;

import java.util.Scanner;


public class appDuckSimulator {

    
    public static void main(String[] args) {
        
        int patinho;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escolha o tipo de pato: ");
        System.out.println("1- Rubber duck.");
        System.out.println("2- Mallard duck .");
        System.out.println("3- Red Head duck.");
        System.out.println("----------------------------");
        
        patinho = teclado.nextInt();
        
        switch (patinho){
            case 1:
                RubberDuck r = new RubberDuck();
                r.display();
                System.out.println("----------------------------");
                break;
            case 2:
                MallardDuck m = new MallardDuck();
                m.display();
                System.out.println("----------------------------");
                break;
            default:
                RedHeadDuck h = new RedHeadDuck();
                h.display();
                break;
        }
        
    }
    
}
