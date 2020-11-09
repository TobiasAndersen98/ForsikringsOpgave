package com.company;

public class Bog {

     int sidtal;
     double pris;
     String forfatter;
     String forlag;

    public Bog(int sidtal, double pris, String forfatter, String forlag) {
        this.sidtal = sidtal;
        this.pris = pris;
        this.forfatter = forfatter;
        this.forlag = forlag;

    }


    public void setForlag(String forlag) {
        this.forlag = forlag;
    }


    public String getForfatter() {
       return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public int getSidtal() {
        return sidtal;
    }

    public void setSidtal(int sidtal) {
        this.sidtal = sidtal;
    }


    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }


    //info-metode
     void udprintinfo(){

         String udprintinfo = " Forlang:" + forlag+ "\n" + " forfatter: " + forfatter + "\n" + " sidetal: " + sidtal + "\n" + " Pris: " + pris;

         System.out.println(udprintinfo);

     }


}
