import java.util.ArrayList;
import java.util.HashMap;

public class Show {
    protected final String title;
    protected int duration;
    protected Director director;
    protected HashMap<String, Actor> listOfActors;

    public Show(String title, int duration) {
        this.title = title;
        this.duration = duration;
        listOfActors = new HashMap<>();
    }

    public HashMap<String, Actor> getListOfActors() {
        return listOfActors;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }
}
