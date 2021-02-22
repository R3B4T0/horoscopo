/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author David Rebato
 */
public class Utilidades {
    public static ArrayList<String> getMeses() {
        ArrayList<String> meses = new ArrayList<String>();
        for (int i = 1; i <= 12; i++){
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    
    public static ArrayList<String> getDias() {
        ArrayList<String> dias = new ArrayList<String>();
        for (int i = 1; i <= 31; i++){
            dias.add(String.valueOf(i));
        }
        return dias;
    }
    
    public static String getSigno(int dia, int mes) {
        String signo = "";
        switch(mes) {
            case 1:
                if(dia > 20) {
                    signo = "Acuario";
                } else {
                    signo = "Capricornio";
                }
                break;
            case 2:
                if (dia > 20) {
                    if (dia <= 20) {
                        signo = "Piscis";
                    } else {
                        signo = "Error en la fecha";
                    }
                } else {
                    signo = "Acuario";
                }
                break;
            case 3:
                if (dia > 20) {
                    signo = "Aries";
                } else {
                    signo = "Acuario";
                }
                break;
            case 4:
                if (dia > 20) {
                    if (dia <= 30) {
                        signo = "Tauro";
                    } else {
                        signo = "Error en la fecha";
                    }
                } else {
                    signo = "Aries";
                }
                break;
            case 5:
                if (dia > 20) {
                    signo = "Geminis";
                } else {
                    signo = "Tauro";
                }
                break;
            case 6:
                if (dia > 20) {
                    if (dia <= 30){
                        signo = "Cancer";
                    } else {
                        signo = "Error en la fecha";
                    }
                } else {
                    signo = "Geminis";
                }
                break;
            case 7:
                if (dia > 20) {
                    signo = "Leo";
                } else {
                    signo = "Cancer";
                }
                break;
            case 8:
                if (dia > 20) {
                    signo = "Virgo";
                } else {
                    signo = "Leo";
                }
                break;
            case 9:
                if (dia > 20) {
                    if (dia <= 30) {
                        signo = "Libra";
                    } else {
                        signo = "Error en la fecha";
                    }
                } else {
                    signo = "Virgo";
                }
                break;
            case 10:
                if (dia > 20) {
                    signo = "Escorpio";
                } else {
                    signo = "Libra";
                }
                break;
            case 11:
                if (dia > 20) {
                    if (dia <= 30){
                        signo = "Sagitario";
                    } else {
                        signo = "Error en la fecha";
                    }
                } else {
                    signo = "Escorpio";
                }
                break;
            case 12:
                if (dia > 20) {
                    signo = "Capricornio";
                } else {
                    signo = "Sagitario";
                }
                break;
        }
        return signo;
    }
}
