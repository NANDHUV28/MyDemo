package examplemovies;
import java.time.Duration;
public class Movies {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private Duration duration;
    private int year;
    private String category;
    private static int moviesCount=0;
    private final String movieID;

    // Constructor for mandatory fields
    public Movies(String movieName, String producedBy){
       if(movieName==null||movieName.isEmpty()){
           throw new IllegalArgumentException("Movie name cannot be null or empty");
       }
       if(producedBy==null||producedBy.isEmpty()){
           throw new IllegalArgumentException("Produced by cannot be null or empty");
       }

       this.movieName=movieName;
       this.producedBy=producedBy;
       moviesCount++;
       movieID=movieName+" "+moviesCount;
    }

    // Constructor to initialize mandatory fields using the existing constructor
    public Movies(String movieName, String producedBy, String directedBy, Duration duration, int year, String category) {
        this(movieName,producedBy);// Call constructor to initialize mandatory fields
        this.movieName = movieName;
        this.producedBy = producedBy;
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
        //moviesCount++;
        //movieID=movieName+" "+moviesCount;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieID() {
        return movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public Duration getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String showDetails(){
        return "MovieName: "+movieName+"\nProducedBy: "+producedBy+"\nDirectedBy: "+directedBy+"\nDuration: "+duration+"\nYear: "+year+"\nCategory: "+category+"\nMovieId: "+movieID;



    }
}
