public class Multiplication {
    public static int mul (int m, int n) {
        int x=0;
        while (n>0) {
            x += m;
            n--;
        }
        return x;
    }
    public static void main(String[] args) {
        int prod = mul(18,44);
        System.out.println(prod);
    }
}