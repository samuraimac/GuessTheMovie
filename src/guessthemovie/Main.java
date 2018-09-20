package guessthemovie;

import java.util.Scanner;

//main code here
//this code only works for movie lists with 100 titles
public class Main {
    public static void main(String[] args) throws Exception{
        String title = GetMovieTitle.chooseMovieTitle();
        System.out.println(title);
        String censoredTitle = HandlesCensoredTitle.getCensoredName(title);
        int mistake = 0;
        int check = 0;
        String wrongLetters = "";
        Scanner sInput = new Scanner(System.in);
        do{
            System.out.println("You are guessing: " + censoredTitle);
            System.out.println("You have guessed (" + mistake + ") wrong letters: " + wrongLetters);
            System.out.println("Guess a letter: ");
            char guess = sInput.next().charAt(0);
            if(ChecksInput.checkGuess(guess,title)){
                int times = HandlesCensoredTitle.getTimes(guess,title);
                for(int i=0;i<times;i++)
                    censoredTitle = HandlesCensoredTitle.changeCensoredName(guess,title,censoredTitle);
            }
            else{
                mistake++;
                wrongLetters = wrongLetters + guess + " ";
            }
            if(title.equals(censoredTitle))
                check = 1;
        }while(mistake<=10 && check!=1);
        if(mistake!=10)
            System.out.println("You Win!");
        else
            System.out.println("You Lose!");
        System.out.println("The movie is " + title + ".");
    }
}
