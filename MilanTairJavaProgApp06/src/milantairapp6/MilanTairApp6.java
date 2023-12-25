package milantairapp6;

import java.util.Scanner;

public class MilanTairApp6 { /* 08 METODE/FUNKCIJE */

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite prvi broj: ");
        int prviBroj = s.nextInt();
        
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = s.nextInt();
        
        System.out.print("Unesite treci broj: ");
        int treciBroj = s.nextInt();
        
        System.out.print("Unesite cetvrti broj: ");
        int cetvrtiBroj = s.nextInt();
        
        /*int manjiOdTaDva = minimumDvaBroja(prviBroj, drugiBroj);
        System.out.println("Manji broj je: " + manjiOdTaDva); */
        
       /*int manjiOdPrvaDvaITreceg = minimumTriBroja(prviBroj, drugiBroj, treciBroj);
        System.out.println("Najmanji od tri broja je: " + manjiOdPrvaDvaITreceg); */
        
        int najmanjiOdCetiri = minimumCetiriBroja(prviBroj, drugiBroj, treciBroj, cetvrtiBroj);
        System.out.println("Najmanji od tri broja je: " + najmanjiOdCetiri);

    } 
    
    public static int minimumDvaBroja(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static int minimumTriBroja(int a, int b, int c) {  
        return minimumDvaBroja(minimumDvaBroja(a, b), c);
    }
    
    public static int minimumCetiriBroja(int a, int b, int c, int d) {
        return minimumDvaBroja(minimumDvaBroja(a, b), minimumDvaBroja(c, d));
    }
    
}
