package modell;

public class TerepJaro extends Auto {

    boolean koszos;
    static final double koszolodas = 0.5;

    public TerepJaro(int benzin, int kilometer) {
        super(benzin, kilometer);
        this.koszos = false;
    }

    @Override
    public void hasznal(int km) {
        if (Math.random() < koszolodas) {
            koszos = true;
            System.out.println("A terepjáró autó koszos");
        }
    }

    public void tisztitas() {
        koszos = false;
    }

    @Override
    public String toString() {
        return "TerepJaro{" + "koszos=" + koszos + '}';
    }
    
}
