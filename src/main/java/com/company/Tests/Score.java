package com.company.Tests;
import java.util.ArrayList;


class Score {
    private static ArrayList<Result> score;

    private String StudentNaam;
    private Integer StudentNummer;
    private String Examen1;
    private String Examen2;
    private String Examen3;


    public Score(String StudenNaam,Integer StudentNummer,String Examen1, String Examen2,String Examen3) {
        this.StudentNaam = StudenNaam;
        this.StudentNummer = StudentNummer;
        this.Examen1 = Examen1;
        this.Examen2 = Examen2;
        this.Examen3 = Examen3;


    }

    private static ArrayList<Result>Score(){
            ArrayList<Result> score = new ArrayList<>();
            score.add(new Result("Alexander", 20220001, "Verkeersexamen1", "Verkeersexamen2", "", 3.3, 4.5, null));
            score.add(new Result("Floor", 20220002, "Verkeersexamen1", "", "Verkeersexamen3", 5.6, null, 7.8));
            score.add(new Result("Shuang", 20220003, "Verkeersexamen1", "Verkeersexamen2", "Verkeersexamen3", 6.5, 3.0, 7.4));
            score.add(new Result("Tommy", 20220004, "Verkeersexamen1", "Verkeersexamen2", "Verkeersexamen3", 6.7, 7.2, 4.8));
            score.add(new Result("Waihong", 20220005, "Verkeersexamen1", "Verkeersexamen2", "", 8.1, 4.3, null));
            return score;
        }

    private static void printResult(String StudentNaam , Integer StudentNummer, String  Examen1, String  Examen2, String  Examen3)
    {
        System.out.println("Student"+StudentNaam+"("+StudentNummer+")"+"heeft een voldoende voor" +Examen1+" "+Examen2+" "+Examen3);
    }

    //menu 6) Hoeveel studenten zijn geslagen voor een examen?
        public void printScore() {

        int count = 0;
            for (int i = 0; score.get(i).getCijfer1() > 5.5||score.get(i).getCijfer2() > 5.5||score.get(i).getCijfer3() > 5.5; i++) {
                count = count++;
                System.out.println("Er zijn in totaal" + count + "hebben een voldoende voor" + score.get(i).getExamen1());
                System.out.println("Er zijn in totaal" + count + "hebben een voldoende voor" + score.get(i).getExamen2());
                System.out.println("Er zijn in totaal" + count + "hebben een voldoende voor" + score.get(i).getExamen3());
            }
        }

    // Menu 7) Welke examens heeft student gehaald?
        public void printExamen(ArrayList<String>StudentNaam){
            for (String naam: StudentNaam) {
                switch (naam) {
                    case "Alexander": printResult(
                            score.get(0).getStudentNaam(),
                            score.get(0).getStudentNummer(),
                            score.get(0).getExamen1(),
                            score.get(0).getExamen2(),
                            score.get(0).getExamen3()
                    );
                    break;

                    case "Floor": printResult(
                            score.get(1).getStudentNaam(),
                            score.get(1).getStudentNummer(),
                            score.get(1).getExamen1(),
                            score.get(1).getExamen2(),
                            score.get(1).getExamen3()
                    );
                    break;

                    case "Shuang": printResult(
                            score.get(2).getStudentNaam(),
                            score.get(2).getStudentNummer(),
                            score.get(2).getExamen1(),
                            score.get(2).getExamen2(),
                            score.get(2).getExamen3()
                    );
                    break;

                    case "Tommy": printResult(
                            score.get(3).getStudentNaam(),
                            score.get(3).getStudentNummer(),
                            score.get(3).getExamen1(),
                            score.get(3).getExamen2(),
                            score.get(3).getExamen3()
                    );
                    break;

                    case "Waihong": printResult(
                            score.get(4).getStudentNaam(),
                            score.get(4).getStudentNummer(),
                            score.get(4).getExamen1(),
                            score.get(4).getExamen2(),
                            score.get(4).getExamen3()
                    );
                    break;

                }
            }

        }

    //menu 8) Welke student heeft de meeste examens gehaald?
    public void printMeestGeslagen(){
        String [] examen = {Examen1,Examen2,Examen3};
        for(int i=0; i < examen.length;i++) {
            if(score.get(i).getCijfer1()>5.5&&score.get(i).getCijfer2() > 5.5&&score.get(i).getCijfer3() > 5.5){
                System.out.println("Student"+StudentNaam+"("+StudentNummer+")"+"heeft de meeste examens gehaald");
            }

            }
        }

    }



class Result {
    private String StudentNaam;
    private Integer StudentNummer;
    private String Examen1;
    private String Examen2;
    private String Examen3;
    private Double Cijfer1;
    private Double Cijfer2;
    private Double Cijfer3;

    public Result(String StudentNaam,Integer StudentNummer,String Examen1,String Examen2,String Examen3,Double Cijfer1,Double Cijfer2,Double Cijfer3){
        this.StudentNaam = StudentNaam;
        this.StudentNummer = StudentNummer;
        this.Examen1 = Examen1;
        this.Examen2 = Examen2;
        this.Examen3 = Examen3;
        this.Cijfer1 = Cijfer1;
        this.Cijfer2 = Cijfer2;
        this.Cijfer3 = Cijfer3;
    }

    public String getStudentNaam(){
        return StudentNaam;
    }

    public Integer getStudentNummer(){
        return StudentNummer;
    }

    public String getExamen1(){
        return Examen1;
    }

    public String getExamen2(){
        return Examen2;
    }

    public String getExamen3(){
        return Examen3;
    }

    public Double getCijfer1(){
        return Cijfer1;
    }

    public Double getCijfer2(){
        return Cijfer2;
    }

    public Double getCijfer3(){
        return Cijfer3;
    }



}
