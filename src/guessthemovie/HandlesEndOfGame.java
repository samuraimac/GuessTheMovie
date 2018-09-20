package guessthemovie;

public class HandlesEndOfGame {
    //checks whether the censored title has been revealed/ guessed by the player or not
    public static boolean checkRevealed(String title, String censoredTitle){
        int len = title.length();
        int check = 0;
        for(int i=0;i<len;i++)
            if(censoredTitle.charAt(i)=='*')
                check++;
        if(check==0)
            return true;
        else
            return false;
    }
}
