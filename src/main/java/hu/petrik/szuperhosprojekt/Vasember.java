package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    public Vasember() {
        super(150,true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if (super.getSzuperero() > 1000){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void kutyutKeszit() {
        Random rand = new Random();
        super.setSzuperero(super.getSzuperero() + rand.nextDouble()*10);
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
