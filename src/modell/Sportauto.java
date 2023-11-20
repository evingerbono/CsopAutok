package modell;

public class Sportauto extends Auto
{
    private boolean osszetort;
    
    public Sportauto(double benzin)
    {
        super(benzin);
        osszetort = false;
    }
    
    public boolean getOsszetort()
    {
        return osszetort;
    }
    
    public void versenyez()
    {
        if (Math.random() < 0.3)
        {
            osszetort = true;
        }
    }
    
    @Override public void megy(double kilometert)
    {
        super.megy(kilometert);
        setBenzin(getBenzin() - 0.1 * kilometert * 1.3);
    }
}
