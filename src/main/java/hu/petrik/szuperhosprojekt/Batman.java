package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman() {
        lelemenyesseg = 100;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if(szuperhos.mekkoraAzEreje() < lelemenyesseg) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Batman: leleményesség: %d", Math.round(lelemenyesseg));
    }
}
