package milantairapp7;

import java.util.Scanner;

public class MilanTairApp7 {/*08 METODE/FUNKCIJE */

    public static void main(String[] args) {//PROVERA ISPRAVNOSTI REGISTARSKE TABLICE  
        Scanner s = new Scanner(System.in);
        
        System.out.println("Unesite registarsku oznaku: ");
        String regOznaka = s.nextLine();
        
        boolean tablicaJeURedu = ispravnaRegistarskaTablica(regOznaka);
        
        if(tablicaJeURedu){
            System.out.println("Tablica je ispravna!");
        } else {
            System.out.println("Tablica nije ispravna!");
        }
       
    }
    
    public static boolean ispravnaRegistarskaTablica(String tablica){           // BG-123-AB, KG-123-AB, NS-123-AB AA-NNN-AA  | 9 ZA DUZINU STRINGA
                                                                                //                                 01     78    SLOVA A-Z, LATINICNA SLOVA
                                                                                //                                  2     6     -
                                                                                //                                    345       CIFRE 0-9
        if (tablica.length() != 9){
            return false;
        }
        
        if (!daLiJeDozvoljenoSlovo(tablica.charAt(0)) || !daLiJeDozvoljenoSlovo(tablica.charAt(1)) || 
            !daLiJeDozvoljenoSlovo(tablica.charAt(7)) || !daLiJeDozvoljenoSlovo(tablica.charAt(8))){
            return false;
        }
        
        if (!Character.isDigit(tablica.charAt(3)) || !Character.isDigit(tablica.charAt(4)) || !Character.isDigit(tablica.charAt(5))){
            return false;
        }
        
        if (tablica.charAt(2) != '-' || tablica.charAt(6) != '-'){
            return false;
        }
        
        return true;
    }
    
    public static boolean daLiJeDozvoljenoSlovo(char slovo){
        if(slovo == 'A' || slovo == 'B' || slovo == 'C' || slovo == 'D' || slovo == 'E' || slovo == 'F' ||
           slovo == 'G' || slovo == 'H' || slovo == 'I' || slovo == 'J' || slovo == 'K' || slovo == 'L' ||
           slovo == 'M' || slovo == 'N' || slovo == 'O' || slovo == 'P' || slovo == 'Q' || slovo == 'R' ||
           slovo == 'S' || slovo == 'T' || slovo == 'U' || slovo == 'V' || slovo == 'W' || slovo == 'X' ||
           slovo == 'Y' || slovo == 'Z' || slovo == 'Ž' || slovo == 'Č' || slovo == 'Ć' || slovo == 'Š' ||
           slovo == 'Đ') {
          return true;
        } else {
            return false;
        }
    }
}
