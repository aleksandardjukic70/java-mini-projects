package milantairjavaprogapp12;

public class MilanTairJavaProgApp12 {//12 SORTIRANJE NIZA OBJEKATA

    public static void main(String[] args) {
        Vektor[] niz = new Vektor[3];
       
        for (int i=0; i<niz.length; i++) {
            niz[i] = Vektor.unosSaTastature();
        }

        Vektor.sort(niz, Vektor.POREDAK.OPADAJUCI);
        
        for (int i=0; i<niz.length; i++) {
            System.out.println(niz[i] + ", intenzitet = " + niz[i].intenzitet());
        }
        
    }
    
}
