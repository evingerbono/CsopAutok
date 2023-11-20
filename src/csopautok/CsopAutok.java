package csopautok;

import modell.SportAuto;
import modell.TerepJaro;

public class CsopAutok {

    public static void main(String[] args) {
        SportAuto sp1 = new SportAuto(70, 10);
        TerepJaro ta1 = new TerepJaro(50, 100);
        
        sp1.hasznal(20);
        System.out.println("A sportautó benzin szintje: "+sp1.getBenzin());
        ta1.hasznal(10);
        System.out.println("A terepjáró benzin szintje: "+ta1.getBenzin());
    }
    
}
