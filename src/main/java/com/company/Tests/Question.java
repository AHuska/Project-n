package com.company.Tests;

import java.util.Scanner;

public class Question {
    private String type;

    public Question(){
        setType();

    }
    public void setType() {
        System.out.println("kies uit onderstaande vragen wat je wilt maken");
        System.out.println("1.Meerkeuzevvragen");
        System.out.println("2.Openvragen");  
        System.out.println("3.Ja of nee vragen");
        Scanner scanner = new Scanner(System.in);
        int invoer = scanner.nextInt();
        switch (invoer) {
            case 1:
                this.type = "Meerkeuzevragen";
                System.out.println("Je maakt nu een meerkeuzevraag.");
                System.out.println("Schrijf hier jouw vraag:");
                scanner.nextLine();
                String meerkeuzevragen = scanner.nextLine();
                System.out.println("Geef een getal tussen 3-4, voor het aantal mogelijkheden");
                int aantal = scanner.nextInt();

                if (aantal == 3) {
                    System.out.println("Antwoord A:");
                    scanner.nextLine();
                    String A = scanner.nextLine();
                    System.out.println("Antwoord B:");
                    String B = scanner.nextLine();
                    System.out.println("Antwoord C:");
                    String C = scanner.nextLine();
                    System.out.println("De goede antwoord is:");
                    String correct_antwoord = scanner.nextLine();
                } else if (aantal == 4) {
                    scanner.nextLine();
                    System.out.println("Antwoord A:");
                    String A = scanner.nextLine();
                    System.out.println("Antwoord B:");
                    String B = scanner.nextLine();
                    System.out.println("Antwoord C:");
                    String C = scanner.nextLine();
                    System.out.println("Antwoord D");
                    String D = scanner.nextLine();
                    System.out.println("De goede antwoord is:");
                    String correct_antwoord = scanner.nextLine();
                } else {
                    System.out.println("Geen correct invoer, probeer opnieuw");
                }



                break;

            case 2:
                this.type = "Openvragen";
                System.out.println("Je maakt nu een openvraag.");
                System.out.println("Schrijf hier jouw vraag:");
                scanner.nextLine();
                String openvragen = scanner.nextLine();


                break;

            case 3:
                this.type = "Ja of nee vragen";
                System.out.println("Je maakt nu een ja of nee vraag.");
                System.out.println("Schrijf hier jouw vraag:");
                String ja_nee_vraag = scanner.nextLine();
                break;

            default:
                System.out.println("Geen correct invoer, probeer opnieuw");
                break;
        }
    }
}




