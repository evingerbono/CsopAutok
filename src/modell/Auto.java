package modell;

public abstract class Auto {
    int benzin,kilometer;
    
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
}
