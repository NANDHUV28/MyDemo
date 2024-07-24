import java.time.Duration;

public class SpecialMovies extends Movies {
    private String soundEffects;
    private String visualEffects;

    public SpecialMovies(String movieName, String producedBy, String directedBy, Duration duration, int year, String category, String soundEffects, String visualEffects){
        super(movieName,producedBy,directedBy,duration,year,category);
        this.soundEffects=soundEffects;
        this.visualEffects=visualEffects;
    }

    public String getSoundEffects() {
        return soundEffects;
    }

    public String getVisualEffects() {
        return visualEffects;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+"\nSoundEffects Technology: "+soundEffects+"\nVisualEffects: "+visualEffects+"\n";
    }
}
