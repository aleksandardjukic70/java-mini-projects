package milantairjavaprogapp14ocenjivanje;

public class MilanTairJavaProgApp14Ocenjivanje {
    
    public static void main(String[] args) {
        Student s = new Student("Pera", "Peric", "2023100200", "pera.peric.10@singimail.rs");
        
              
        s.evidentirajTest(new Test("Programiranje", "1. kolokvijum", 30, 20));
        s.evidentirajTest(new Test("Programiranje", "2. kolokvijum", 30, 16));
        s.evidentirajTest(new Test("Programiranje", "Zavrsni ispit", 30, 10));
        s.evidentirajTest(new Test("Programiranje", "1. kolokvijum", 30, 20));
        
        s.prikazRezultataTestova();
    }
    
}
