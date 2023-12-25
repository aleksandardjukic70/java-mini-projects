package milantairapp2;

import java.util.Scanner;

public class MilanTairApp2 {/*04 PROMENLJIVE, ARITMETIKA, ULAZ */

        public static void main(String[] args) {
            
            
            Scanner s = new Scanner(System.in);
            
            System.out.print("Unesite broj x: ");
            double x = s.nextDouble();
            
            double f = Math.sqrt(x);
            
            System.out.println("Kvadratni koren broja x je: " + f);
            
            /* REDOSLED ARITMETICKIH FUNKCIJA U JAVI
            
            System.out.print("Unesite x vrednost: ");
            double x = s.nextDouble();
            
            System.out.print("Unesite y vrednost: ");
            double y = s.nextDouble();
            
            double f = x * y - (1 - x) + 3;
            
            System.out.println("F(x,y) = " + f);
            */
            
            
            
            /* KONVERTOVANJE TEMPERATURE IZ F u C
            
            System.out.print("Unesite temperaturu u F: ");
            
            double tempF = s.nextDouble();
            
            double tempC = (tempF - 32) / 1.8;
           
            System.out.println("Temperatura u Celzijusima iznosi: " + tempC);
            */
            
            
            
            /* KONVERTOVANJE TEMPERATURE IZ C u F
            
            System.out.print("Unesite temperaturu u C: ");
            
            double tempC = s.nextDouble();
            
            double tempF = (tempC * 1.8) + 32;
            
            System.out.println("Temperatura u Farenhajtima iznosi: " + tempF);
            */
            
            
            
            /* IZRACUNAVANJE GODINE DIPLOMIRANJA STUDENTA
            
            System.out.print("Godina upisa studenta: ");
            
            int godinaUpisa = s.nextInt();
            int godinaDiplomiranja = godinaUpisa + 4;
            System.out.println("Godina diplomiranja: " + godinaDiplomiranja);
            */
    }
    
}
