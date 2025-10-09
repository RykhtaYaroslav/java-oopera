import java.util.ArrayList;
import java.util.HashMap;

public class ShowManager {
    // Валидация всех передаваемых данных выполнена мной вручную))

    private static HashMap<String, Show> allShows;

    public ShowManager() {
        allShows = new HashMap<>();
    }

    public void createNewShow(String title, int duration) {
        Show newShow = new Show(title, duration);
        allShows.put(title, newShow);
        System.out.println("Создано шоу \"" + title + "\"");
    }

    public void createNewBallet(String title, int duration, Person musicAuthor, String librettoText, Person choreographer) {
        Ballet newBallet = new Ballet(title, duration, musicAuthor, librettoText, choreographer);
        allShows.put(title, newBallet);
        System.out.println("Создан балет \"" + title + "\"");
    }

    public void createNewOpera(String title, int duration, Person musicAuthor, String librettoText, int choirSize) {
        Opera newOpera = new Opera(title, duration, musicAuthor, librettoText, choirSize);
        allShows.put(title, newOpera);
        System.out.println("Создана опера \"" + title + "\"");
    }

    public void printLibretto(String title) {
        if (allShows.get(title).getClass() != Opera.class && allShows.get(title).getClass() != Ballet.class) {
            System.out.println("У этого типа представлений нет libretto");
            return;
        }
        ;
        System.out.println("Либретто представления \"" + allShows.get(title).getTitle() + "\": ");
        MusicalShow musicalShow = (MusicalShow) allShows.get(title);
        System.out.println(musicalShow.getLibrettoText());
    }

    public void deleteShow(String title) {
        allShows.remove(title);
        System.out.println("Удалено представление \"" + title + "\"");
    }

    public void setShowActor(String title, Actor newActor) {
        allShows.get(title).getListOfActors().put(newActor.surname, newActor);
        System.out.println("В представление \"" + allShows.get(title).getTitle() + "\" добавлен " + newActor);
    }

    public void setShowDirector(String title, Director newDirector) {
        allShows.get(title).setDirector(newDirector);
        System.out.println("В представление \"" + allShows.get(title).getTitle() + "\" добавлен " + newDirector);
    }

    public void changeActor(String title, String oldActorSurname, String newActorSurname) {
        Actor newActor = PersonManager.getAllActors().get(newActorSurname); // получили ссылку на актёра
        Actor oldActor = allShows.get(title).getListOfActors().get(oldActorSurname); // получили ссылку на актёра
        allShows.get(title).getListOfActors().remove(oldActorSurname); // удалили актёра из каста
        allShows.get(title).getListOfActors().put(newActorSurname, newActor); // добавили актёра в каст
        System.out.println("В представлении \"" + allShows.get(title).getTitle() + "\" заменили " + oldActor + " на " + newActor);
    }

    public void changeDirector(String title, Director newDirector) {
        allShows.get(title).setDirector(newDirector);
        System.out.println("В представлении \"" + allShows.get(title).getTitle() + "\" изменили режиссёра. Новый " + newDirector);
    }

    public void printActorsCast(String title) {
        System.out.println("В представлении  \"" + title + "\" задействованы следующие актёры:");
        for (Actor actor : allShows.get(title).getListOfActors().values()) {
            System.out.println(actor);
        }
    }
}
