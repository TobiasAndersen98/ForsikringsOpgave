package com.company;


import java.util.Scanner;


public class indbo {

    info f = new info();


    Scanner scanner = new Scanner(System.in);

    public void indbo() {

        System.out.print("Indtast din adrasse:");
        String Adrasse = scanner.next();
        System.out.println(Adrasse);

        System.out.print("Indtast din nr:");
        int Nr = scanner.nextInt();
        System.out.println(Nr);

        System.out.print("Hvor stor er din bolig: ");
        int m2 = scanner.nextInt();
        f.setM2(m2);
        int pris1=f.getM2() * 2;

        System.out.print("Intast din alder: ");
        int alder = scanner.nextInt();
        f.setAlder(alder);


        if(f.getAlder()>= 18 && f.getAlder() <=25){
            System.out.println(pris1 +120 + "kr");

        }else if (f.getAlder()>= 26 && f.getAlder() <=50){
            System.out.println(pris1 +100 + "kr");

        }else if (f.getAlder()>= 51 && f.getAlder() <=80){
            System.out.println(pris1 +80 + "kr");

        } else{
            System.out.println(pris1 +60 + "kr");
        }
    }

}





