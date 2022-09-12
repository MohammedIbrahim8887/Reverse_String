import java.util.Scanner;
class demo {
    public static void main(String[] args) {
        take_word();

    }

    public static void take_word() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        String word = in.nextLine();
        int word_length = word.length();
        char[] words = word.toCharArray();
        char letters;
        int i = word_length;
            while (i > 0) {
                letters = words[i - 1];
                System.out.print(letters);
                i--;
            }
        }
}



