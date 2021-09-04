public class Enumeration {
    public static void main(String[] args) {
        for(int x=0; x<=9;x++) {
            for(int y=0; y<=9; y++) {
                if((50 + x) * 4158 == (10 * y + 3) * 3564) {
                    System.out.println("The answer is: x = "+x+" y = "+y+" ");
                    break;
                }
             }
         }
    }
}
