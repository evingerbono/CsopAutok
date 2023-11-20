package modell;

public class Kolcsonzo
{
    private final Auto[] autok;
    
    public Kolcsonzo(int autokSzama)
    {
        autok = new Auto[autokSzama];
    }
    
    public Auto kikolcsonoz(Class autoTipus)
    {
        int i = 0;
        while (i < autok.length && (autok[i] == null || autok[i].getClass() != autoTipus))
        {
            i++;
        }
        if (i < autok.length)
        {
            Auto auto = autok[i];
            autok[i] = null;
            return auto;
        }
        else
        {
            System.out.println("Nincs ilyen típusú autó jelenleg a kölcsönzőben");
            return null;
        }
    }
    
    public void autotBehoz(Auto auto)
    {
        if (auto instanceof Sportauto sportAuto && sportAuto.getOsszetort())
        {
            System.out.println("Összetört autót nem lehet visszahozni");
            return;
        }
        int i = 0;
        while (i < autok.length && autok[i] != null)
        {
            i++;
        }
        autok[i] = auto;
    }
}
