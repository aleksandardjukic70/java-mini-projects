package milantairjavaprogapp12;

import java.util.Scanner;

public class Vektor {
    double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public Vektor() {
        this.x = 0.0;
        this.y = 0.0;
        // Podrazumevane vrednosti x, y kada ne unesemo argumente u konstruktor
    }

    public Vektor(double x, double y) {
        this.x = x;
        this.y = y;
        // Konstruktor sa argumentima double x i double y
    }
    
    public Vektor(Vektor v) {//***Vektor v
        //konstruktor za kreiranje novog vektora
        this.x = v.getX();
        this.y = v.getY();
        //**objekat klase vektor
    }
    
    public void saberi(Vektor v) {
        this.x += v.getX();
        this.y += v.getY();
        //metod za sabiranje vektora
    }
    
    public void oduzmi(Vektor v) {
        this.x -= v.getX();
        this.y -= v.getY();
        //metod za sabiranje vektora
    }
    
    public void skaliraj(double skalar) {
        this.x *= skalar;
        this.y *= skalar;
    }
    
    public double intenzitet() {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
    }

    @Override
    public String toString() {
        return "Vektor{" + "x=" + x + ", y=" + y + '}';
        //specijalni metod za ispisivanje vrednosti vektora u konzolu 
        //koji omogucava sabiranje stringova i bilo kog objekta
    }
    
    public static Vektor unosSaTastature() { //ovaj metod ce kao rezultat dati objekat klase Vektor
        Scanner s = new Scanner(System.in);
        
        Vektor v = new Vektor();
        
        System.out.println("Unesite velicine komponenata vektora (x i y odvojene sa razmakom): ");
        
        v.setX(s.nextDouble());
        v.setY(s.nextDouble());
        
        return v;
    }
    
    public static void zameni(Vektor a, Vektor b) {
        double privremenoX = a.getX();
        a.setX(b.getX());
        b.setX(privremenoX);
        
        double privremenoY = a.getY();
        a.setY(b.getY());
        b.setY(privremenoY);
        // zamena objekata (zamena vrednosti vektorima a i b)
    }
    
    public enum POREDAK {OPADAJUCI, RASTUCI};
    
    public static void sort(Vektor[] niz, POREDAK poredak) {
        for (int j=0; j<niz.length-1; j++) {
            for (int i=0; i<niz.length-1; i++) {
                if (poredak == POREDAK.RASTUCI) {
                    if (niz[i].intenzitet() > niz[i+1].intenzitet()) {
                        Vektor.zameni(niz[i], niz[i+1]);
                    }
                } else if (poredak == POREDAK.OPADAJUCI){
                    if (niz[i].intenzitet() < niz[i+1].intenzitet()) {
                        Vektor.zameni(niz[i], niz[i+1]);
                    }
                  }
            }
        }
    }
}
