package modell;

public abstract class Auto
{
    private double kilometer;
    protected double benzin;
    
    public Auto(double benzin)
    {
        kilometer = 0;
        this.benzin = benzin;
    }
    
    public double getKilometer()
    {
        return kilometer;
    }
    
    public double getBenzin()
    {
        return benzin;
    }
    
    public void megy(double kilometert)
    {
        kilometer += kilometert;
    }
}
