import java.util.Random;
import java.util.Scanner;
public class GuessNumber{
    public static void guessNumber () {
        int range, answer, result, i=1; 
        Scanner myinput = new Scanner(System.in);
        try{
            System.out.print("Please set the range: ");
            range = myinput.nextInt();
            Random myr = new Random();
            answer = myr.nextInt(range)+1;
            System.out.print("This program will create a integer between 1 to "+range+". Please guess: ");
            result = myinput.nextInt();
            while(i==1){
                if(result==0){
                    System.out.println("Exited successfully.");
                    break;}
                else if(result<answer){
                    System.out.println("Your answer is too small.");
                    System.out.print("Please try again: ");
                    result = myinput.nextInt();}
                else if(result>answer){
                    System.out.println("Your answer is too big.");
                    System.out.print("Please try again: ");
                    result = myinput.nextInt();}
                else if(result==answer){
                    System.out.println("Congratulations, you guessed it right.");
                    break;}
            }
            System.out.println("Thank you for using this program. Hava a good day.");
        }
        finally{
            myinput.close();
        }
    }
    public static void main(String[] args) {
        guessNumber();
    }
}
