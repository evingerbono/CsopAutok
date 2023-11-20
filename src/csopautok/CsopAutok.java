package csopautok;

import modell.Kolcsonzo;
import modell.Sportauto;
import modell.Terepjaro;

public class CsopAutok
{
    public static void main(String[] args)
    {
        Kolcsonzo k = new Kolcsonzo(5);
        
        k.autotBehoz(new Sportauto(5));
        k.autotBehoz(new Sportauto(4));
        k.autotBehoz(new Terepjaro(3));
        k.autotBehoz(new Terepjaro(4));
        
        Sportauto s1 = (Sportauto)k.kikolcsonoz(Sportauto.class);
        s1.megy(10);
        System.out.println(s1.getBenzin() + " liter benzin maradt az s1 autóban");
        s1.versenyez();
        System.out.println("Az autó " + (s1.getOsszetort() ? "összetört!" : "nem tört össze"));
        k.autotBehoz(s1);
        
        Terepjaro t1 = (Terepjaro)k.kikolcsonoz(Terepjaro.class);
        t1.megy(10);
        System.out.println(t1.getBenzin() + " liter benzin maradt az t1 autóban");
        t1.offroadMegy();
        t1.setKoszos(false);
        k.autotBehoz(t1);
    }
}
