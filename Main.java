import java.util.Scanner;
class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!Buddy Welcome To The Number Gussing Game.");


        int chances = 3;
        System.out.println("You Have "+chances+" Chances To Win The Game");
        System.out.println("Guess a number between 1-100");

        int score = 0;
        boolean playAgain = true;

        while(playAgain) {
            for (int i = 0; i < chances; i++) {


                System.out.println("Chance: " + (i + 1) + '\n' + "Enter Your Guess Between 1-100 - ");
                Scanner scan = new Scanner(System.in);
                int Guess = scan.nextInt();
                int randomNumber = (int) (Math.random() * 100);
                System.out.println("The Random Number Between The Range Of 1-100 is - " + randomNumber);

                if (Guess == randomNumber) {
                    System.out.println("Congratulations!You Gussed The Number");
                    score++;
                    break;

                } else if (Guess > randomNumber) {
                    System.out.println("YOUR GUSSED NUMBER IS TOO HIGH ");
                    System.out.println( "You Have "+ (chances -1 -i)+" Chance Left");


                } else {
                    System.out.println("YOUR GUSSED NUMBER IS TOO LOW ");
                    System.out.println("You Have "+ (chances -1 -i)+" Chance Left");


                }

            }
            System.out.println("Thats it , Hope you enjoyed it...!");
            System.out.println("Here is your score " + ": " + score + " out of "+ chances + " chances");

            System.out.println("Do you want to Play Again ? (Type '1'- for yes  or '0' - for no'): ");
            String pA  = scanner.next();
            playAgain = pA.equalsIgnoreCase("1");
        }


        }

    }
