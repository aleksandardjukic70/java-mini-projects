package milantairjavaprogapp11;

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
}
