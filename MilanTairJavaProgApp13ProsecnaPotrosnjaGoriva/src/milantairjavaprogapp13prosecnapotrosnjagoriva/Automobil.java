package milantairjavaprogapp13prosecnapotrosnjagoriva;

public class Automobil {
    private double rezervoar = 0.0;
    private double predjenaKilometraza = 0.0;
    
    private double predjenaKilometrazaKodPoslednjeDopune = 0.0;
    private double stanjeRezervoaraKodPoslednjeDopune = 0.0;
    private double iznosPoslednjeDopuneRezervoara = 0.0;

    public double getRezervoar() {
        return rezervoar;
    }

    public double getPredjenaKilometraza() {
        return predjenaKilometraza;
    }
    
    public void dopuniGorivo(double kolicina) {
        System.out.println("Do sada je prosecna potrosnja bila " + this.prosecnaPotrosnjaOdPoslednjeDopune());
        stanjeRezervoaraKodPoslednjeDopune = rezervoar;
        predjenaKilometrazaKodPoslednjeDopune = predjenaKilometraza;
        
        rezervoar += kolicina;
        
        iznosPoslednjeDopuneRezervoara = kolicina;
    }
    
    public void voziPoGradu(double put) {
        predjenaKilometraza += put;
        rezervoar -= (put / 100.) * 7.0;
    }
    
    public void voziNaOtvorenom(double put) {
        predjenaKilometraza += put;
        rezervoar -= (put/100.) * 5.6;
    }
    
    public double prosecnaPotrosnjaOdPoslednjeDopune() {
        double predjeniPut, potrosenoGorivo;
        
        predjeniPut = predjenaKilometraza - predjenaKilometrazaKodPoslednjeDopune;
        potrosenoGorivo = (stanjeRezervoaraKodPoslednjeDopune + iznosPoslednjeDopuneRezervoara) - rezervoar;
        
        return (potrosenoGorivo * 100.) / predjeniPut;
    }
}
