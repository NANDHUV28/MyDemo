import java.time.Duration;

public class InternationalMovies extends Movies {
    private String country;
    private String language;

    public InternationalMovies(String movieName, String producedBy, String directedBy, Duration duration, int year, String category, String country, String language){
        super(movieName,producedBy,directedBy,duration,year,category);
        this.country=country;
        this.language=language;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+"\nCountry:  "+country+"\nLanguage:  "+language;
    }
}
