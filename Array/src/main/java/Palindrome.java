
public class Palindrome {
    public static void main(String[] args) {
        int x = 12321;
        String str = String.valueOf(x);
//    System.out.println(isPalindrome(str, 0, str.length()-1));
    }


    public static boolean isPalindrome(String[] str, int left, int right){
        if (left <= right){
            if (str[left].equals(str[right])){
                return isPalindrome(str, left+1, right-1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}


