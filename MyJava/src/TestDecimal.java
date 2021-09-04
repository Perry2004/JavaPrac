import java.util.Random;
import java.util.Scanner;
;public class TestDecimal {
    public static void test(int times) {
        Random random = new Random();
        boolean result;
        for(int i=0;i<=times;i++) {
            float x1 = random.nextFloat();
            int x2 = random.nextInt(1000);
            float x = x1 + x2;
            result = 3.0 == x * (3.0 / x);
            System.out.println(i+"\t"+x+"\t"+result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int times = scanner.nextInt();
            test(times);
        }
        finally {
            scanner.close();
        }
    }
}
