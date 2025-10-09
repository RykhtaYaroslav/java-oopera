public class Director extends Person {
    private int numberOfShow;

    public Director(String name, String surname, Sex sex, int numberOfShow) {
        super(name, surname, sex);
        this.numberOfShow = numberOfShow;
    }

    @Override
    public String toString() {
        return "Режиссёр " + name + " " + surname + " (пол " + sex + ",  " + numberOfShow + " поставленных представлений)";
    }
}
