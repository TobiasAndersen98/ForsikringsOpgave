package com.company;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);



    public void alder() {

          System.out.println("Hvor gammel er dU");
        int alder = scanner.nextInt();



        if(alder>=18)
            menu();


        else
           System.out.println("du er ikke gammel nok til at have en for sikring");

    alder();

}

    private final String optionsMenu = "Velkomen til alka forsikring\n\n1. Bil" +
            "\n2. Indbo \n3. Ulykke";

    public void menu(){


        System.out.println(optionsMenu);
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        switch (selection){
            case 1:
               // Bil();
                break;
            case 2:
                indbo indbo = new indbo();
                indbo.indbo();
                break;
            case 3:
               // Ulykke();
                break;

        }

    }
}
