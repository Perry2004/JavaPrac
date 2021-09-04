/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 * 来源：力扣（LeetCode） 
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Perry Zhu
 * @param aNum a integer number 
 * @return true if the integer is a palindrome, and return false when it is not a palindrome 
 */
 
public class PalindromeNumber {
    private static int reverseNumber (int aNum) {
        int num = aNum;
        int temp;
        int res = 0;
        while (true) {
            temp = num % 10;
            res = res * 10 + temp;
            num /= 10;
            if (num == 0) {
                break;
            }
        }
        return res;
        }

    static boolean isPalindrome (int x) {
        if (x == 0) {
            return true;
        }
        else if (x < 0) {
            return false;
        }
        else {
            int reversedX = reverseNumber(x);
            if (x == reversedX) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        boolean a = isPalindrome(-121);
        System.out.println(a);
    }
}