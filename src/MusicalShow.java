public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow (String title, int duration, String musicAuthor, String librettoText) {
        super(title, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText () {
        return librettoText;
    }
}
