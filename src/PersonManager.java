import java.util.HashMap;

// управляет созданием, удалением, распечаткой объектов актёров и режиссёров
public class PersonManager {
    private static HashMap<String, Actor> allActors;
    private static HashMap<String, Director> allDirectors;
    private static HashMap<String, Person> otherPersons;

    public PersonManager() {
        allActors = new HashMap<>();
        allDirectors = new HashMap<>();
        otherPersons = new HashMap<>();
    }

    public void addActor(String name, String surname, Sex sex, int height) {
        Actor newActor = new Actor(name, surname, sex, height);
        allActors.put(surname, newActor);
        System.out.println("Добавлен " + newActor);
    }

    public void removeActor(String surname) {
        Actor delActor = allActors.get(surname);
        allActors.remove(surname);
        System.out.println("Удалён " + delActor);
    }

    public void printAllActors() {
        System.out.println("Сейчас в театре работают следующие актёры: ");
        for (Actor actor : allActors.values()) {
            System.out.println(actor);
        }
    }

    public void addDirector(String name, String surname, Sex sex, int numberOfShow) {
        Director newDirector = new Director(name, surname, sex, numberOfShow);
        allDirectors.put(surname, newDirector);
        System.out.println("Добавлен " + newDirector);
    }

    public void removeDirector(String name, String surname, Sex sex, int numberOfShow) {
        Director newDirector = new Director(name, surname, sex, numberOfShow);
        allDirectors.remove(surname);
        System.out.println("Удалён " + newDirector);
    }

    public void printAllDirectors() {
        System.out.println("Сейчас в театре работают следующие режиссёры: ");
        for (Director director : allDirectors.values()) {
            System.out.println(director);
        }
    }

    public static HashMap<String, Actor> getAllActors() {
        return allActors;
    }

    public static HashMap<String, Director> getAllDirectors() {
        return allDirectors;
    }

    public static HashMap<String, Person> getOtherPersons() {
        return otherPersons;
    }

    public void addMusicAuthor(String name, String surname, Sex sex) {
        Person musicAuthor = new Person(name, surname, sex);
        musicAuthor.setDescription("Автор музыки");
        otherPersons.put(surname, musicAuthor);
        System.out.println("Добавлен новый " + musicAuthor);
    }

    public void addChoreographer(String name, String surname, Sex sex) {
        Person choreographer = new Person(name, surname, sex);
        choreographer.setDescription("Хореограф");
        otherPersons.put(surname, choreographer);
        System.out.println("Добавлен новый " + choreographer);
    }
}

