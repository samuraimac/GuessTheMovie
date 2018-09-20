package guessthemovie;

import java.util.Scanner;
import java.io.File;

public class GetMovieTitle {
    //randomly selects a movie title from the list
    public static String chooseMovieTitle() throws Exception{
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        String[] titles = new String[100];
        String name = "";
        int titlesCtr = 0;
        while(scanner.hasNextLine()){
            titles[titlesCtr] = scanner.nextLine();
            titlesCtr++;
        }
        int index = (int) (Math.random() * titlesCtr);
        name = titles[index];
        return name;
    }
}
