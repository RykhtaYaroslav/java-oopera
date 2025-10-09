public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
