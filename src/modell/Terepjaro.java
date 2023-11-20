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
    
    public void setKoszos(boolean koszos)
    {
        this.koszos = koszos;
    }
    
    public void offroadMegy()
    {
        setKoszos(true);
    }

    @Override public void megy(double kilometert)
    {
        super.megy(kilometert);
        setBenzin(getBenzin() - 0.1 * kilometert);
    }
}
