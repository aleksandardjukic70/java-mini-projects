package milantairjavaprogapp11;

public class MilanTairJavaProgApp11 {//11 - DEFINISANJE KLASA,GETERA,SETERA I KONSTRUKTORA

    public static void main(String[] args) {
        //Vektor v1 = new Vektor(); // Poziva se konstruktor Vektor() koji ne uzima argumente
        Vektor v1 = new Vektor(4.5, 11.2); // Poziva se konstruktor Vektor(double x, double y) koji uzima argumente double x i double y
        Vektor v2 = new Vektor(1.2, 10.4);
        //v1.setY(3.2); //od ovog trenutka vredost promenljive x ostaje isto a promenljiva y nema vrednost 11.2 nego 3.2
         
        /*System.out.println("Vektor jedan ima velicine: " + v1.getX() + " i " + v1.getY());
        Ispisivanje x i y vrednosti vektora v1
        */
        
        //Vektor v3 = new Vektor();
       // v3.setX(v1.getX() + v2.getX());
       // v3.setY(v1.getY() + v2.getY());
        //Sabiranje vektora peske
        
        //Vektor v3 = new Vektor();
       // v3.setX(v1.getX());
        //v3.setY(v1.getY());
        // pravimo novi vektor koji je ima identicne vrednosti kao vektor v1
        
        Vektor v3 = new Vektor(v1);//*referenca pod imenom v3
        //Rekli smo programu: Napravi novi vektor cije vrednosti uzimamo od ***Vektora v,
        //smestamo u nas **objekat klase vektor i smestamo u *referencu pod imenom v3
        
        v3.saberi(v2);
        v3.skaliraj(3.0);
        v3.oduzmi(v1);
               
        System.out.println("V1 = " + v1);
        System.out.println("V2 = " + v2);
        System.out.println("V3 = " + v3);
        
        System.out.println("V3 intenzitet = " + v3.intenzitet());
        
        
    }
    
}
