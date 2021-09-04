public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        while (i == 0) {
            if (a * a + a * a * a == 392) {
                System.out.println(a);
                break;
            }
            a++;
        }
    }
}
