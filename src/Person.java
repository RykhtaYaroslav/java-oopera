public class Person {
    protected final String name;
    protected final String surname;
    protected final Sex sex;
    protected String description;

    public Person(String name, String surname, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description + " " + name + " " + surname + " (пол: " + sex + ")";
    }
}
