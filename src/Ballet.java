public class Ballet extends MusicalShow {
    protected Person choreographer;

    public Ballet(String title, int duration, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
