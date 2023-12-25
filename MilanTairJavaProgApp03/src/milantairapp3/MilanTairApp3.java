package milantairapp3;

import java.util.Scanner;

public class MilanTairApp3 { /* USLOVNO GRANANJE - IF/ELSE */

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite godinu rodjenja: ");
        
        int godinaRodjenja = s.nextInt();
        
        if (godinaRodjenja % 2 == 0) {
            System.out.println("Godina rodjenja koju ste uneli je parna.");
        } else {
            System.out.println("Godina rodjenja koju ste uneli je neparna.");
        }
        
        System.out.println("Program je izvrsen");
    }
    
}
