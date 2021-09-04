import java.util.Scanner;
public class ConvertTime {
    public static int convertTime() {
        int originMin, originSec, min, result;
        String origin;
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        origin = scanner.next();
        originMin = Integer.parseInt(String.valueOf(origin.charAt(0)));
        min = originMin * 60;
        originSec = Integer.parseInt(String.valueOf(origin.charAt(3)+origin.charAt(4)));
        result = originSec + min;
        scanner.close();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convertTime());
    }
}
