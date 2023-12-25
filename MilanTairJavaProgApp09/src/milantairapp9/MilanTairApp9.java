package milantairapp9;

import java.util.Scanner;

public class MilanTairApp9 {// RAD SA NIZOVIMA

    public static void main(String[] args) {//PROGRAM KOJI PRIKAZUJE NAJMANJI I NAJVECI ELEMENT U NIZU
        Scanner s = new Scanner(System.in);
        
        double[] niz = new double[10];
        
        for (int i=0; i<niz.length; i++){
            System.out.println("Unesite sledeci broj: ");
            niz[i] = s.nextDouble();
        }
        
        double najmanji = Double.MAX_VALUE; 
        double najveci = Double.MIN_VALUE;
        
        for (int i=0; i<niz.length; i++){
            if (niz[i] < najmanji){
                najmanji = niz[i];
            } 
            
            if (niz[i] > najveci){
                najveci = niz[i];
            }
        }
        
        System.out.println("Najmanja vrednost u nizu je: " + najmanji);
        System.out.println("Najveca vrednost u nizu je: " + najveci);
    }    
}

