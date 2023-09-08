package reverse_string;

public class ReverseString {
    public static void main(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j) {
            char temp = s[j];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
