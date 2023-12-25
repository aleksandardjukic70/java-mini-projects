package milantair10;

import java.util.Arrays;

public class MilanTair10 { // 10 - SORTIRANJE NIZOVA, NIZ KAO ARGUMENT METODA
    public enum Poredak { RASTUCI, OPADAJUCI };
    
    public static void sortirajNiz(double[] niz, Poredak p){
        for (int a=0; a<niz.length-1; a++){
            for (int i=0; i<niz.length-1; i++){
                
                if (p == Poredak.RASTUCI){
                    if (niz[i] > niz[i+1]){
                        double privremeno = niz[i];
                        niz[i] = niz[i+1];
                        niz[i+1] = privremeno;
                    }
                } else if (p == Poredak.OPADAJUCI){
                    if (niz[i] < niz[i+1]) {
                        double privremeno = niz[i];
                        niz[i] = niz[i+1];
                        niz[i+1] = privremeno;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        double[] niz = {3.6, 7.8, 1.5};
        
        System.out.println("Niz je bio: " + Arrays.toString(niz));
        
        sortirajNiz(niz, Poredak.RASTUCI);
        //sortirajNiz(niz, Poredak.OPADAJUCI);
        
        System.out.println("Niz je sada: " + Arrays.toString(niz));
    }
    
}
