package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scan = new Scanner(System.in);

    //todo Task 1
    public void largestNumber(){
            double nummer;
            int zaehlen = 1;
            double max = 0;

            do {
                System.out.print("Number " + zaehlen + ": ");
                nummer = scan.nextFloat();
                //System.out.printf(); //für die doubless

                if (zaehlen == 1 && nummer <= 0) {
                    System.out.println("No number entered.");
                    break;
                }
                if (nummer > max) {
                    max = nummer;
                }

                if (nummer <= 0) {

                    System.out.printf( "The largest number is "+ "%.2f", max);
                    System.out.println();

                }
                zaehlen++;

            } while (nummer > 0);
        }






    //todo Task 2
    Scanner scanner = new Scanner(System.in);
    public void stairs(){
        System.out.print("n: ");
        int z = 1;
        int reihe = scanner.nextInt();
        if(reihe <= 0) {
            System.out.println("Invalid number!");
        }else {
            for (int i = 1; i <= reihe; i++) {
                for( int j = 0; j < i; j++) {
                    System.out.print(z++ + " ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
       int number = 6;
       for (int z = 1; z <= number; z++){
           for(int j = number - z; j > 0; j--)
           {
               System.out.print(" ");
           }
           for (int y = 1; y <= (z * 2) - 1; y++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }

    //todo Task 4
    public void printRhombus(){

    }

    //todo Task 5
    public void marks() {
        Scanner scan= new Scanner(System.in);
        int nummer = 1;
        double note = 1;
        double sum = 0;
        double durchschnitt;
        int zählen = 0;
        int NegativeNoten = 0;

        while (note > 0){
            System.out.print("Mark " + nummer + ": ");
            nummer++;

            note = scan.nextInt();

            if ((nummer == 2) && (note == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");

            }else if ((note > 5) && (note != 0))
            {
                System.out.println("Invalid mark!");
                nummer--;

            }else if ((note > 0) &&(note < 6))
            {
                sum = sum + note;
                zählen++;

                if(note == 5) {
                    NegativeNoten++;
                }

            }else if (note == 0){
                durchschnitt = sum/(zählen);
                System.out.println("Average: "+ String.format("%.2f", durchschnitt));
                System.out.println("Negative marks: "+ NegativeNoten);
            }
        }
    }



    //todo Task 6
    public void happyNumbers(){
            Scanner scan= new Scanner(System.in);
            System.out.print("n: ");
            int nummer = scan.nextInt();
            int sum2;
            int d3;
            int d2;
            int d1;

            while (nummer > 0) {

                if (nummer != 1 && nummer != 4) {
                    d3 = nummer % 10;
                    d2 = (nummer / 10) % 10;
                    d1 = (nummer / 100) % 10;

                    sum2 = (int) (Math.pow(d1,2) + Math.pow(d2,2) + Math.pow(d3,2));
                    nummer = sum2;

                } else if (nummer == 1) {
                    System.out.println("Happy number!");
                    break;

                } else if (nummer == 4) {
                    System.out.println("Sad number!");
                    break;
                }
            }
        }


    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}