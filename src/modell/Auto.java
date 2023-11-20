package modell;

public abstract class Auto {
    int benzin,kilometer;
    boolean hasznal;
    
    public Auto(int benzin,int kilometer){
        this.benzin=benzin;
        this.kilometer=kilometer;
    }
    public int getBenzin(){
        return benzin;
    }
    public int getKilometer(){
        return kilometer;
    }
    public void setBenzin(int benzin){
        this.benzin=benzin;
    }
     public void setKilometer(int kilometer){
        this.kilometer=kilometer;
    }
    
    public void hasznal(int km) {
        if (!hasznal) return;
        this.kilometer += km;
        this.benzin -= km / 10;
    }
}
