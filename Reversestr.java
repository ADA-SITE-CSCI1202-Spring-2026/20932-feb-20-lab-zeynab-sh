public class Reversestr {
    
    

    public static void main(String[] args) {

        String text = "hello";

        String reversed = reverse(text);

        System.out.println(reversed);
    }

    public static String reverse(String str) {

        StringBuilder n = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            n.append(str.charAt(i));
        }

        return n.toString();
    }


}
