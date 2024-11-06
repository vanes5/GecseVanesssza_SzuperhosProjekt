package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<Szuperhos>();

    public static void szereplok(String eleresiUt){
        try {
            FileReader fr = new FileReader(eleresiUt);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                String[] data = line.split(" ");
                if (Objects.equals((String) data[0], "Batman")) {
                    Batman b = new Batman();
                    for (int i = 0; i < Integer.parseInt(data[1]); i++) {
                        b.kutyutKeszit();
                    }
                    szuperhosLista.add(b);
                }
                else if(Objects.equals(data[0], "Vasember")) {
                    Vasember v =  new Vasember();
                    for (int i = 0; i < Integer.parseInt(data[1]); i++) {
                        v.kutyutKeszit();
                    }
                    szuperhosLista.add(v);
                }
                line = br.readLine();
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void szuperhosok(){
        for(Szuperhos s : szuperhosLista){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        szereplok("src/test/resources/szuperhos.txt");
        szuperhosok();
    }
}
