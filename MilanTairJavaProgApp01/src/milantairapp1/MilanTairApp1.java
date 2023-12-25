package milantairapp1;

public class MilanTairApp1 { // 03 PROMENLJIVE, ULAZ, IZLAZ, BROJEVI, TEKST
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        int c; 
               
        c = a * b;
        
        System.out.println(c);
        
        c = a * a * 4;
        
        System.out.println(c);
        
        double d = 1.0 * a / b; // mnozimo celobrojnu promenljivu a sa 1.0 da bi prevarili javu da misli da imamo vrednost koja je realan broj koji delimo sa celobrojnom vrednoscu, 
                                // rezultat se zatim upisuje u promenljivu realnog tipa te dobijamo rezultat 3.33333.. za operaciju 10 / 3
        
        System.out.println(d);
       
        /*
        int godinaRodjenjaStudenta;
        int godinaRodjenjaProfesora;
        
        godinaRodjenjaStudenta = 1988;
        godinaRodjenjaProfesora = 1981;
        
        int razlikaUGodinama = godinaRodjenjaStudenta - godinaRodjenjaProfesora; 
        
        String poruka = "Razlika u godinama je " + razlikaUGodinama + ".";
        
        System.out.println(poruka);
        /*
        
        */
        /* double pi = 3.1415;
        
        boolean daLiJeStudentPolozioIspit = true;
        
        char slovo = 'M';
        
        String imeStudenta = "Pera";
        String prezimeStudenta;
        
        prezimeStudenta = "Peric"; */
        
        
    }
    
}
