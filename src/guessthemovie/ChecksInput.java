package guessthemovie;

public class ChecksInput {
    public static boolean checkGuess(char letter, String name){
        int len = name.length();
        boolean isCorrect = false;
        for(int i=0;i<len;i++)
            if(name.charAt(i)==letter) isCorrect = true;
        return isCorrect;
    }
}
