package com.company;

public class ReligionsBog extends Bog {

    String religion;

    public ReligionsBog(int sidtal, double pris, String forfatter, String forlag, String religion) {
        super(sidtal, pris, forfatter, forlag);
        this.religion = religion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    void udprintinfo() {

        String udprintinfo = " Forlang:" + forlag + "\n" + " religion " + religion + "\n" + " forfatter: " + forfatter + "\n" + " sidetal: " + sidtal + "\n" + " Pris: " + pris;

        System.out.println(udprintinfo);

    }



}
