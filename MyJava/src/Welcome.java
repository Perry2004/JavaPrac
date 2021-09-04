import java.util.Scanner;
import java.util.Random;
public class Welcome {
	public static void welcomPerry(){
		System.out.print("What is your name: ");
		Scanner myinput = new Scanner(System.in);
		String myName = myinput.nextLine();
		if(myName.equals("Perry")) {
			System.out.print("Passward: ");
			String myPassward = myinput.nextLine();
		
			if(myPassward.equals("040205")) {
				System.out.println("Welcome,"+myName);
				int luckyValue;
				Random myr = new Random();
				luckyValue = myr.nextInt(100)+1;
				System.out.println("今天你的幸运值是:"+luckyValue+".");
				
				if(luckyValue >= 85) {
					System.out.println("今天运气不错哦");
				}
				else if(luckyValue == 100) {
					System.out.println("今天运气爆棚哦");
				}
				else if(luckyValue >= 45) {
					System.out.println("今天是寻常的一天");
				}
				else if(luckyValue < 45) {
					System.out.println("今天运气不太好哦");
				}
				
				System.out.println("Thank you for using your first Python program.");
				System.out.println("Hava a good day!");
				System.out.println();
			}
			else {
				System.out.println("Wrong passward.");
			}
		}
		else {
			System.out.println("Sorry, you do not have access to this program.");
		}
		myinput.close();
	}
	public static void main(String[] args) {
		welcomPerry();
	}
}
