package examplemovies;

import java.time.Duration;

public class SpecialMovie extends Movies{
    private String soundEffects;
    private String visualEffects;

    public SpecialMovie(String movieName, String producedBy, String directedBy, Duration duration, int year, String category, String soundEffects, String visualEffects){
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
}
