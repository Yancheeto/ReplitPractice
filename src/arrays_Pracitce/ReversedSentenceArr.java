package arrays_Pracitce;

public class ReversedSentenceArr {

    /*
    Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
     */

    public static void main(String[] args) {
        String sentence = "Today is Saturday";

        String [] words = sentence.split(" ");
        String reverse = " ";
        for(int i= words.length-1;  i>=0; i--){
            reverse += words[i] + " ";
        }

        System.out.println(reverse.trim());

    }

}
