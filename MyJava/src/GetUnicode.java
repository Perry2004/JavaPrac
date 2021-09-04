public class GetUnicode {
    public static void getUnicode (String originalChar) {
        for (int i = 0; i < originalChar.length(); i++) {
            String unicode = Integer.toHexString(originalChar.charAt(i));
            Integer res = Integer.parseInt(unicode,16);
            System.out.print(res);
            if (i !=  originalChar.length() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        getUnicode("宋国华");
    }
}