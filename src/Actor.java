import java.util.Objects;

public class Actor extends  Person {
    private final int height;

    public Actor (String name, String surname, Sex sex,  int height) {
        super(name, surname, sex);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && sex.equals(actor.sex) && name.equals(actor.name) && surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    @Override
    public String toString() {
        return "Актёр " + name + " " + surname + " (пол: " + sex + ", рост: " + height + ")";
    }
















}
