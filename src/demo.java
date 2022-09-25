import java.util.Scanner;
class demo {
    public static void main(String[] args) {
        take_word();
    }

    public static void take_word() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        String word = in.nextLine();
        String[] word1 = word.split(" ");
        for(int i=0;i<word.length();i++){
            if(word1[i].length()>=5){
                char[] words = word1[i].toCharArray();
                char letters;
                int j = word1[i].length();
                while (j > 0) {
                    letters = words[j - 1];
                    System.out.print(letters);
                    j--;
                }
                System.out.print(" ");
            }
            else
               System.out.print(word1[i] + " ");
        }
        }
}



