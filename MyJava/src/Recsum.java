import java.util.Scanner;
public class Recsum {
    public static int recsum(int x,int acc) {
        if(x == 1) {
            return x + acc;
        }
        else {
            return x + recsum(x-1,acc);
        }
    }
    
    public static int recsum (int x) {
        int sum = 0;
        return recsum(x,sum);
    }

    public static int fib(int x) {
        if(x == 1 || x == 2) {
            return 1;
        }
        else {
            return fib(x - 2) + fib(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Get recsum and fib: ");
        int x = scanner.nextInt();
        System.out.println("Recsum: "+recsum(x));
        System.out.println("Fib: "+fib(x));
        scanner.close();
        System.out.println("Thank you for using this program. \nHave a good day. ");
    }
}