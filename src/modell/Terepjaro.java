// Terepjaro.java
package modell;

public class Terepjaro extends Auto {

    private boolean koszos;
    private boolean offroad;

    public Terepjaro(String nev, double fogyasztas) {
        super(nev, fogyasztas);
        this.koszos = false;
        this.offroad = false;
    }

    @Override
    public void megy(double kilometer) {
            super.megy(kilometer);
            if (this.offroad) {
                this.koszos = true;
                System.out.println("A terepjáró koszos lett offroad miatt.");
            }
    }

    public boolean isKoszos() {
        return koszos;
    }

    public void lemos() {
        if (koszos) {
            koszos = false;
            System.out.println("A terepjáró le lett mosva.");
        } else {
            System.out.println("A terepjáró tiszta, nincs szükség lemosásra.");
        }
    }

    @Override
    public void visszahoz() {
        if (!koszos) {
            super.visszahoz();
        } else {
            System.out.println("A terepjárót nem lehet visszahozni, mert még koszos. Mielőtt visszahozod, mossd le!");
        }
    }

    private boolean offroad() {
        return this.offroad = true;
    }
}
