public class LeetCodeEjercicios {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));;
    }

    public static boolean isPalindrome(int x){
        String original = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(original).reverse();
        return original.equals(reversed.toString());
    }
}
