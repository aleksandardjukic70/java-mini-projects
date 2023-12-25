package milantairjavaprogapp14ocenjivanje;

public class Test {
    private String predmet;
    private String nazivTesta;
    private int brojPitanja;
    private double brojTacnihOdgovora;

    public String getPredmet() {
        return predmet;
    }

    public String getNazivTesta() {
        return nazivTesta;
    }

    public int getBrojPitanja() {
        return brojPitanja;
    }

    public double getBrojTacnihOdgovora() {
        return brojTacnihOdgovora;
    }
    
    public double getBrojNetacnihOdgovora() {
        return brojPitanja - brojTacnihOdgovora;
    }
    
    public double getBrojPoena() {
        return 30. * getBrojTacnihOdgovora() / getBrojPitanja();
    }

    public Test(String predmet, String nazivTesta, int brojPitanja, double brojTacnihOdgovora) {
        this.predmet = predmet;
        this.nazivTesta = nazivTesta;
        this.brojPitanja = brojPitanja;
        this.brojTacnihOdgovora = brojTacnihOdgovora;
    }
    
    public enum REZULTAT_TESTA {PAO, USLOVNO_POLOZIO, POLOZIO};
    
    public REZULTAT_TESTA oceniTest() {
        double poeni = getBrojPoena();
        
        if (poeni < 11) {
            return REZULTAT_TESTA.PAO;
        } else if (poeni >= 11 && poeni < 17) {
            return REZULTAT_TESTA.USLOVNO_POLOZIO;
        } else {
            return REZULTAT_TESTA.POLOZIO;
        }
    }
    
    //nerformatirani prikaz

    @Override
    public String toString() {
        String opisnaOcena = "";
        
        REZULTAT_TESTA rezultat = oceniTest();
        
        switch (rezultat) {
            case PAO:
                opisnaOcena = "Pao";
                break;
            case USLOVNO_POLOZIO:
                opisnaOcena = "Uslovno polozio";
                break;
            case POLOZIO:
                opisnaOcena = "Polozio";
                break;
        }
        
        return String.format("%-30s\t%-30s\t%.2f/%d\t%.2f\t%s", getPredmet(), getNazivTesta(), 
                                                     getBrojTacnihOdgovora(), getBrojPitanja(),
                                                     getBrojPoena(), opisnaOcena);
        
        
                
      /*return getPredmet() + " " + getNazivTesta() + " " + 
               getBrojTacnihOdgovora() + "/"   + getBrojPitanja() + " " + 
               getBrojPoena() + " " + opisnaOcena; -------- ovo je isto kao i konacan string?*/
        
    }
    
    
}
