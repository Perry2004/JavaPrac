import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ChoosingAssisstant{
    public static void choose(){
        int times, resultNum, a = 0;
        String option;
        Scanner input = new Scanner(System.in);
        try{
            ArrayList <String> choiceList = new ArrayList <String> ();
            times = 0;
            while (a == 0) {
                System.out.print ("Please type option" + (times+1) + ": ");
                option = input.nextLine();
                if (option.equals("")) {
                    a = 1;
                }
                else {
                    choiceList.add(option);
                    times ++;
                }
            }

            System.out.println("Input over.");
            Random random = new Random();
            resultNum = random.nextInt(choiceList.size());
            System.out.println("The result is: "+choiceList.get(resultNum));
        }
        finally{
            input.close();
            System.out.println("Thank you for using this program. \nHave a good day. ");
        }
    }
    public static void main(String[] args) {
        choose();
    }
}