package modell;

public class SportAuto extends Auto {

    boolean torott;
    static final double extraFogy = 0.3;
    static final double baleset = 0.3;

    public SportAuto(int benzin, int kilometer) {
        super(benzin, kilometer);
        this.torott = false;
    }

    @Override
    public void hasznal(int km) {
        super.hasznal(km);
        this.benzin -= km * extraFogy;
        if (Math.random() < baleset) {
            torott = true;
            System.out.println("A sport autó össze van törve");
        }
    }

    @Override
    public String toString() {
        return "SportAuto{" + "torott=" + torott + '}';
    }
    
}
