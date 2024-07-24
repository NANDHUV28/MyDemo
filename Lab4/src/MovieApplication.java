import java.time.Duration;

public class MovieApplication {
    public static void main(String args[]){
        Movies[] movies = new Movies[3];

        //array of Movie class and store Objects of Movie, SpecialMovie and InternationalMovie classes in the array.
        movies[0]=new Movies("GOAT","Sun Pictures","Venkat Prabhu", Duration.ofHours(2).plusMinutes(30),2024,"Action/Sci-fi");
        movies[1]=new SpecialMovies("Leo","SunTv","Lokesh",Duration.ofHours(2).plusMinutes(50),2023,"Action/Thriller","Dolby Atmos","CGI");
        movies[2]=new InternationalMovies("Gilli","A.M.Rathnam","Dharani",Duration.ofHours(2).plusMinutes(47),2004,"Action/Sport","India","Tamil");

        //single for loop traverse the above array and call the method showDetails() on all the objects of the array.
        for(Movies movie:movies) {
            System.out.println(movie.showDetails());
            System.out.println();
        }

        //call the methods of SpecialMovie and InternationalMovie while traversing the array inside the for loop
        //use typecasting to do this.
        System.out.println("Details of special movies");
        System.out.println();
        for(int i=0;i< movies.length;i++)
        {
            if (movies[i] instanceof SpecialMovies)
            {
                SpecialMovies specialMovies = (SpecialMovies) movies[i];
                System.out.println("Movie Name: " + specialMovies.getMovieName());
                System.out.println("Movie VisualEffects: " + specialMovies.getVisualEffects());
                System.out.println("Movie SoundEffects: " + specialMovies.getSoundEffects());
            }
        }
        System.out.println();

        System.out.println("Details of international movies");
        System.out.println();
        for(int i=0;i< movies.length;i++)
        {
             if (movies[i] instanceof InternationalMovies)
             {
                InternationalMovies internationalMovies=(InternationalMovies) movies[i];
                System.out.println("Movie Name: " + internationalMovies.getMovieName());
                System.out.println("Movie Country: " + internationalMovies.getCountry());
                System.out.println("Movie Language: " + internationalMovies.getLanguage());
            }
        }
        System.out.println();
        System.out.println("Total movies created: "+Movies.getMoviesCount());
    }
}
