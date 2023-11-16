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
        super.megy(kilometer);

        if (this.versenyzik && !osszetort) {
            if (Math.random() < 0.3) {
                osszetort = true;
                szervizben = true;
                System.out.println("\nA sportautó összetört a verseny során!");
                System.out.println("Az autó szervizbe került. Javítasd meg!\n");
            } else {
                if (osszetort == true && versenyzik == false) {
                    System.out.println("Javítsd meg a kocsid a versenyzés előtt!");
                } else {
                    System.out.println("\nMegusztad, nem tört össze az autód a verseny során!\n");
                }

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
            System.out.println("Az autó sikeresen megjavítva. Most már újra használhatod!");
        } else {
            System.out.println("Az autó nem szorul javításra");
        }
    }

    public boolean versenyzik() {
        if (this.osszetort) {
            return this.versenyzik = false;
        } else {
            return this.versenyzik = true;
        }

    }
}
