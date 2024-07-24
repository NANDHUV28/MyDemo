import examplemovies.InternationalMovie;
import examplemovies.Movies;
import examplemovies.SpecialMovie;

import java.time.Duration;

public class MovieApplication {
    public static void main(String args[]){
        Movies movies=new Movies("GOAT","Sun Pictures","Venkat Prabhu", Duration.ofHours(2).plusMinutes(30),2024,"Action/Sci-fi");
        System.out.println(movies.showDetails());
        System.out.println();

        SpecialMovie specialMovie=new SpecialMovie("Leo","SunTv","Lokesh",Duration.ofHours(2).plusMinutes(50),2023,"Action/Thriller","Dolby Atmos","CGI");
        System.out.println(specialMovie.showDetails());
        System.out.println("SoundEffects: "+specialMovie.getSoundEffects());
        System.out.println("VisualEffects: "+specialMovie.getVisualEffects());
        System.out.println();

        InternationalMovie internationalMovie=new InternationalMovie("Gilli","A.M.Rathnam","Dharani",Duration.ofHours(2).plusMinutes(47),2004,"Action/Sport","India","Tamil");
        System.out.println(internationalMovie.showDetails());
        System.out.println("Country: "+internationalMovie.getCountry());
        System.out.println("Language: "+internationalMovie.getLanguage());
        System.out.println();

        System.out.println("Total movies created: "+Movies.getMoviesCount());


    }
}
