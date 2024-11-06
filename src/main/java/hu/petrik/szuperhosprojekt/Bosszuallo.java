package hu.petrik.szuperhosprojekt;

abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            if (((Bosszuallo) szuperhos).isVanEGyengesege() && this.mekkoraAzEreje() > ((Bosszuallo) szuperhos).mekkoraAzEreje()) {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (((Batman) szuperhos).mekkoraAzEreje() <= this.mekkoraAzEreje()) {
                return true;
            }
            else{
                return false;
            }
        }
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        String str = String.format("Szupererő: %d; %s gyengesége", Math.round(szuperero), (vanEGyengesege? "van":"nincs"));
        return str;
    }
}
