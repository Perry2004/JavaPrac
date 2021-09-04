public class DecodeUnicode {
    public static void decodeUnicode (int...unicodeValue) {
        for (int unicode : unicodeValue) {
            char res = (char) unicode;
            System.out.print(res);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        decodeUnicode(23435,22269,21326);
    }
}
