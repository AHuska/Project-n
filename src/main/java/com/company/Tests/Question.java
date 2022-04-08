package com.company.Tests;

import java.util.Scanner;
import java.util.ArrayList;

public class Question {
    private String type;
    private String vraag ;
    private ArrayList<String> answer;
    private String correct;
    private Integer punten;
    private Boolean result;
    private Integer Weight;

    public Question(Integer Weight) {
        answer = new ArrayList<String>();
        setType();
        this.Weight = Weight;
    }


    public Integer getWeight() {
        return Weight;
    }

    public void setType() {
        System.out.println("kies uit de onderstaande vragen wat je wilt maken");
        System.out.println("1.Meerkeuzevvragen");
        System.out.println("2.Openvragen");
        System.out.println("3.Ja of nee vragen");
        Scanner scanner = new Scanner(System.in);
        int invoer = scanner.nextInt();
        String correct_antwoord = "Null";
        switch (invoer) {
            case 1:
                this.type = "Meerkeuzevragen";
                System.out.println("Je maakt nu een meerkeuzevraag.");
                System.out.println("Schrijf hier jouw vraag:");
                scanner.nextLine();
                String meerkeuzevragen = scanner.nextLine();
                System.out.println("Geef een getal tussen 3-4, voor het aantal mogelijkheden");
                int aantal = scanner.nextInt();
                System.out.println("geef ook punten ");
                punten = scanner.nextInt();
                if (aantal == 3) {
                    meerkeuze_antwoord();
                    System.out.println("De goede antwoord is:");
                    correct_antwoord = scanner.nextLine();
                     correct = correct_antwoord;

                } else if (aantal == 4) {
                    meerkeuze_antwoord();
                    System.out.println("Antwoord D");
                    String D = scanner.nextLine();
                    System.out.println("De goede antwoord is:");
                     correct_antwoord = scanner.nextLine();
                    correct = correct_antwoord;

                } else {
                    System.out.println("Geen correct invoer, probeer opnieuw");
                }
                setVraag(meerkeuzevragen);
                setAnswer(correct_antwoord);


                break;

            case 2:
                this.type = "Openvragen";
                System.out.println("Je maakt nu een openvraag.");
                System.out.println("Schrijf hier jouw vraag:");
                scanner.nextLine();
                String openvragen = scanner.nextLine();
                System.out.println("De goede antwoord is:");
                 correct_antwoord = scanner.nextLine();
                correct = correct_antwoord;
                setVraag(openvragen);
                setAnswer(correct_antwoord);


                break;

            case 3:
                this.type = "Ja of nee vragen";
                System.out.println("Je maakt nu een ja of nee vraag.");
                System.out.println("Schrijf hier jouw vraag:");
                String ja_nee_vraag = scanner.nextLine();
                System.out.println("De goede antwoord is:");
                 correct_antwoord = scanner.nextLine();
                correct = correct_antwoord;
                setVraag(ja_nee_vraag);
                setAnswer(correct_antwoord);

                break;

            default:
                System.out.println("Geen correct invoer, probeer opnieuw");
                break;
        }
    }



        public void setVraag(String question) {
            vraag = question;



        }

        public void setAnswer(String antwoord ) {
            ArrayList<String> answer = new ArrayList<String>();
        }

        public void meerkeuze_antwoord(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Antwoord A:");
            scanner.nextLine();
            String A = scanner.nextLine();
            System.out.println("Antwoord B:");
            String B = scanner.nextLine();
            System.out.println("Antwoord C:");
            String C = scanner.nextLine();
        }

    public Boolean getResult() {
        return result;
    }
}






