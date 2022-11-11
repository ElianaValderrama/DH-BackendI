package Pelis;

import java.util.Arrays;

public class IP {

    private int [] nros = new int[4];

    public IP(int nro1, int nro2, int nro3, int nro4) {
        this.nros[0] = nro1;
        this.nros[1] = nro2;
        this.nros[2] = nro3;
        this.nros[3] = nro4;
    }

    @Override
    public String toString() {
        return "IP{" +
                "nros=" + Arrays.toString(nros) +
                '}';
    }

    String getPais(){
        String pais="";
        if(nros[0]<=49){
            pais = "Argentina";
        }
        if(nros[0]<=99 && nros[0]>=50){
            pais = "Brasil";
        }
        if(nros[0]<=149 && nros[0]>=100){
            pais = "Colombia";
        }
        return pais;
    }

}
