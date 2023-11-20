package main;

import modell.SportAuto;
import modell.Terepjaro;

public class CsopAutok {

    public static void main(String[] args) {

        SportAuto sportAuto = new SportAuto("Porsche 911", 10);
        Terepjaro terepjaro = new Terepjaro("Land Rover Defender", 13);

        sportAuto.kikolcsonoz();
        terepjaro.kikolcsonoz();
        System.out.println("");
        
        
        sportAuto.versenyzik();
        
        sportAuto.megy(700);
        sportAuto.javitas();
        sportAuto.megy(30);
        
        terepjaro.offroad();
        terepjaro.megy(100);
        
                
        System.out.println("");
        sportAuto.visszahoz();

        terepjaro.visszahoz();
        
        terepjaro.lemos();
        terepjaro.visszahoz();
        

    }

}
