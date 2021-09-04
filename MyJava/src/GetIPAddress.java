import java.net.*;
import java.util.Scanner;
public class GetIPAddress {
    public static void getAddres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type the website: ");
        String website = scanner.nextLine();
        website = website.substring(8);
        try {
            System.out.println(website);
            InetAddress inetAddress = InetAddress.getByName(website);
            System.out.println("The host name of the website is: "+inetAddress.getHostName());
            System.out.println("The host address of the website is: "+inetAddress.getHostAddress());
        }
        catch(UnknownHostException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
            System.out.println("Thank you for using this program.\nHave a good day.");
        }
    }

    public static void main(String[] args) {
    getAddres();
    }
}
