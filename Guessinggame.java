import java.util.scanner;

class GuessingGame {

    static int secretNumber = 4;

    public static void main (String[]args){
        System.out.printLn(x:"Please gueass an integer between o and 10!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == secretNumber) {
            System.out.printLn(x:"YAY! you guessed right");

        } else {
            System.out.printLn(x:"Sorry, guess again");
        }

        input.close();
    }

}