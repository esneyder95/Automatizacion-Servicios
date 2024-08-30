package org.servicios.ListaRestricitiva.Utils;

import net.serenitybdd.core.pages.PageObject;

public class DataRandom extends PageObject {



    public static int identificacionR(){
        int idenR = 1000000;
        int idenD = 100000;

        int idenRfinal = (int) (Math.floor(Math.random() * (idenR - idenD + 1)) + idenR);
        int Rfinal = Integer.parseInt("10" + idenRfinal);

        return Rfinal;

    }

    public static int identificacionD(){
        int idenR = 1000000;
        int idenD = 100000;

        int idenDfinal = (int) (Math.floor(Math.random() * (idenR - idenD + 1)) + idenR);
        int Dfinal = Integer.parseInt("70" + idenDfinal);

        return Dfinal;

    }

    public static String NumeroCelular() {
        String NumCel = "";
        String celu1 = "";
        String celu2 = "";
        String celu3 = "";
        int cel1 = (int) (1 + (Math.random() * 299));
        int cel2 = (int) (1 + (Math.random() * 999));
        int cel3 = (int) (1 + (Math.random() * 999));
        if (cel1 < 100 && cel1 >= 10){
            celu1 = ("0" + cel1);
        }else if (cel1 < 10){
            celu1 = ("00" + cel1);
        }else{
            celu1 = String.valueOf(cel1);
        }
        if (cel2 < 100 && cel2 >= 10){
            celu2 = ("0" + cel2);
        }else if (cel2 < 10){
            celu2 = ("00" + cel2);
        }else{
            celu2 = String.valueOf(cel2);
        }
        if (cel3 < 100 && cel3 >= 10){
            celu3 = ("0" + cel3);
        }else if (cel3 < 10){
            celu3 = ("00" + cel3);
        }else{
            celu3 = String.valueOf(cel3);
        }
        NumCel = ("3" + celu1 + celu2 + celu3);
        return NumCel;
    }
}
