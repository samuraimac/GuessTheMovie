package guessthemovie;

public class HandlesCensoredTitle {
    //censors the title
    public static String getCensoredName(String title){
        int len = title.length();
        String censoredName = "";
        for(int i=0;i<len;i++){
            if(title.charAt(i) == ' ')
                censoredName = censoredName + " ";
            else
                censoredName = censoredName + "*";
        }

        return censoredName;
    }
    //gets the number of occurrence of the character in the title
    public static int getTimes(char letter, String title){
        int len = title.length();
        int timesCtr = 0;
        for(int i=0;i<len;i++)
            if(title.charAt(i)==letter)
                timesCtr++;
        return timesCtr;
    }
    //changes the censored title
    public static String changeCensoredName(char letter, String title, String censoredTitle){
        int len = censoredTitle.length();
        String newCensoredName = "";
        for(int i=0;i<len;i++){
            if(title.charAt(i)==letter && censoredTitle.charAt(i)!=letter){
                StringBuilder sHolder = new StringBuilder(censoredTitle);
                sHolder.setCharAt(i,letter);
                newCensoredName = sHolder.toString();
            }
        }
        return  newCensoredName;
    }
}
