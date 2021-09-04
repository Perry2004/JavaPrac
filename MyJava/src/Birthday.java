import java.util.Scanner;
public class Birthday {
	public static void getBirthday(){
		String idNum;
		Scanner myinput = new Scanner(System.in);
		System.out.print("What is your ID number: ");
		idNum = myinput.next();
		int length = idNum.length();
		if (length != 18) {
			System.out.println("This is not an ID number.");
		}
		else {
			System.out.println("Your birthday is: "+idNum.substring(6,14));
		}
		System.out.println("Thank you for using.");
		myinput.close();
	}
	public static void main(String[] args) {
		getBirthday();
	}
}
