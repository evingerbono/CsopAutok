package modell;

public abstract class Auto {
    private double kilometer, benzin;
    
    public Auto(double kilometer, double benzin) {
        this.kilometer = kilometer;
        this.benzin = benzin;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public double getBenzin() {
        return benzin;
    }

    public void setBenzin(double benzin) {
        this.benzin = benzin;
    }
    
    
    public void Auot(){
    
    }
}
