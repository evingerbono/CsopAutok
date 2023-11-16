// Auto.java
package modell;

public abstract class Auto {
    private double kilometer, benzin, fogyasztas;
    private final String nev;
    private boolean hasznalatban = false;

    public Auto(String nev,double fogyasztas) {
        this.benzin = 70;
        this.fogyasztas = fogyasztas;
        this.nev = nev;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public double getBenzin() {
        return benzin;
    }

    public void setBenzin(double benzin) {
        this.benzin = benzin;
    }

    public double getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(double fogyasztas) {
        this.fogyasztas = fogyasztas;
    }

    public void megy(double kilometer) {
        if(hasznalatban){
        if ((this.benzin == 0)||(benzin < (fogyasztas / 100) * kilometer)) {
             System.out.println(this.nev +": "+"\n\tNincs elegendő benzined. Tankolj!");
        } else {
            this.kilometer += kilometer;
            this.benzin -= (fogyasztas / 100) * kilometer;
            System.out.println(this.nev +": "+"\n\tEnnyi km-t ment az auto: "+this.kilometer + "\n\tEnnyi l benzined maradt még: "+this.benzin);
        }
        }
        else{System.out.println(this.nev +": "+"\n\tNincs még használatban, kölcsönözd ki!");}
    }

    public void tankol() {
        this.benzin = 70;
        System.out.println(this.nev +": "+"Az autot megtankoltad!");
    }
    
    public boolean isHasznalatban() {
        return hasznalatban;
    }

    public void kikolcsonoz() {
        if (!hasznalatban) {
            hasznalatban = true;
            System.out.println(this.nev +": "+"Az autót ki kölcsönözted!");
        } else {
            System.out.println(this.nev +": "+"HIBA: Az autó már ki van kölcsönözve!");
        }
    }

    public void visszahoz() {
        if (hasznalatban) {
            hasznalatban = false;
            System.out.println(this.nev +": "+"Vissza lett hozva!");
        } else {
            System.out.println(this.nev +": "+"HIBA: nincs még kikölcsönözve!");
        }
    }
}
