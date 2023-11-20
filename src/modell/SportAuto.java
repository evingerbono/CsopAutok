// SportAuto.java
package modell;

import java.util.Random;

public class SportAuto extends Auto {

    private boolean osszetort = false;
    private boolean versenyzik = false;
    private boolean szervizben = false;

    public SportAuto(String nev, double fogyasztas) {
        super(nev, fogyasztas);
    }

    @Override
    public void megy(double kilometer) {
        if (this.versenyzik) {
            super.megy(10); //Ha versenyzik az autó alapértelmezetten 10km-t megy(anyi egy futam)!
            if (Math.random() < 0.3) {
                osszetort = true;
                szervizben = true;
                System.out.println("\nA sportautó összetört a verseny során!");
                System.out.println("Az autó szervizbe került. Javítasd meg!\n");
                this.versenyzik = false;
            } else {
                System.out.println("\nMegusztad, nem tört össze az autód a verseny során!\n");
                this.versenyzik = false;
            }
        } else {
            if (osszetort == true) {
                System.out.println("Javítsd meg a kocsid mert összetört!");
            } else {
                super.megy(kilometer);
            }

        }
    }

    public boolean isOsszetort() {
        return osszetort;
    }

    public void javitas() {
        if (szervizben && osszetort) {
            szervizben = false;
            osszetort = false;
            System.out.println("\tAz autó sikeresen megjavítva. Most már újra használhatod!\n");
        } else {
            System.out.println("\tAz autó nem szorul javításra\n");
        }
    }

    public boolean versenyzik() {
        if (this.osszetort) {
            return this.versenyzik = false;
        } else {
            System.out.println("A Sport autód versenyen vesz részt!");
            return this.versenyzik = true;

        }

    }
}
