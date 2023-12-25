package milantairapp8;

import java.util.Scanner;

public class MilanTairApp8 {/* 09 RAD SA NIZOVIMA */

    public static void main(String[] args) {/*IZRACUNAVANJE SREDNJE VREDNOSTI NIZA n ELEMENATA */
        Scanner s = new Scanner(System.in);
         
        System.out.println("Unesite broj elemenata: ");
        int n = s.nextInt();
        
        int[] niz = new int[n];
        
       
        for (int i=0; i<niz.length; i++){
            System.out.println("Unesite sledeci broj: ");
            niz[i] = s.nextInt();
        }
        
        int suma = 0;
        
        for (int i=0; i<niz.length; i++){
            suma += niz[i];
        }
        
        double srednjaVrednost = 1.0 * suma / n;
        
        System.out.println("Srednja vrednost je: " + srednjaVrednost);
    }
    
}
