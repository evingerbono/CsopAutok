package modell;

public class Terepjaro extends Auto
{
    private boolean koszos;
    
    public Terepjaro(double benzin)
    {
        super(benzin);
        koszos = false;
    }
    
    public boolean getKoszos()
    {
        return koszos;
    }
    
    public void offroadMegy()
    {
        koszos = true;
    }

    @Override public void megy(double kilometert)
    {
        super.megy(kilometert);
        benzin -= 10 * kilometert;
    }
}
