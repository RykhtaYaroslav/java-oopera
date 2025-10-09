public class Theatre {

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        // с помощью менеджера актёров можно будет добавлять, удалять актёров, распечатывать список действующих актёров
        ShowManager showManager = new ShowManager();
        // менеджер шоу будет управлять созданием, изменением и сохранением объектов-шоу

        /* Сначала я невнимательно читал ТЗ и начал делать консольный интерфейс. Для ввода с консоли я придумал
        записывать новые объекты-актёры в HashMap<String, Actor> чтобы их удобно сохранять и использовать при
        необходимости. Далее я понял, что консоль тут не надо по условиям ТЗ и в целях экономии времени я удалил
        консольный интерфейс, но идея хранить актёров и режиссёров в HasMap мне понравилась, поэтому и остался класс,
        управляющий созданием и хранением объектов актёров и режиссёров.
         */

        personManager.addActor("Иван", "Иванов", Sex.MALE, 180);
        personManager.addActor("Мария", "Маринова", Sex.FEMALE, 170);
        personManager.addActor("Ахмуд-Аббад-ибн-Халиф", "Бурджхалифов", Sex.MALE, 177);
        personManager.addActor("Имя", "Фамилия", Sex.FEMALE, 177);
        personManager.printAllActors();
        System.out.println();
        personManager.removeActor("Фамилия");
        personManager.printAllActors();
        System.out.println();
        personManager.addDirector("Пётр", "Петров", Sex.MALE, 4);
        personManager.addDirector("Акулина", "Акулинова", Sex.FEMALE, 9);
        System.out.println();

        showManager.createNewShow("Люди Х против людей Y", 120);
        showManager.setShowActor("Люди Х против людей Y", PersonManager.getAllActors().get("Иванов"));
        showManager.setShowActor("Люди Х против людей Y", PersonManager.getAllActors().get("Маринова"));
        showManager.setShowActor("Люди Х против людей Y", PersonManager.getAllActors().get("Бурджхалифов"));
        showManager.setShowDirector("Люди Х против людей Y", PersonManager.getAllDirectors().get("Акулинова"));
        showManager.printActorsCast("Люди Х против людей Y");
        System.out.println();

        showManager.createNewOpera("Колобок", 50, "Автор Музыки", "Жили старик " +
                "со старухой, проголодались и испекли колобка, а он убежал в лес, где его съела лиса", 20);
        showManager.setShowActor("Колобок", PersonManager.getAllActors().get("Иванов"));
        showManager.setShowActor("Колобок", PersonManager.getAllActors().get("Бурджхалифов"));
        showManager.setShowDirector("Колобок", PersonManager.getAllDirectors().get("Акулинова"));
        showManager.printActorsCast("Колобок");
        showManager.printLibretto("Колобок");
        System.out.println();

        showManager.createNewBallet("Страусиное озеро", 75, "Другой автор музыки",
                "Страусы у озера танцуют брейк-данс", "Имя хореографа");
        showManager.setShowActor("Страусиное озеро", PersonManager.getAllActors().get("Маринова"));
        showManager.setShowActor("Страусиное озеро", PersonManager.getAllActors().get("Бурджхалифов"));
        showManager.setShowDirector("Страусиное озеро", PersonManager.getAllDirectors().get("Петров"));
        showManager.printActorsCast("Страусиное озеро");
        showManager.printLibretto("Страусиное озеро");
        System.out.println();
        showManager.changeActor("Страусиное озеро","Маринова", "Иванов");
        showManager.printActorsCast("Страусиное озеро");
        System.out.println();

        showManager.changeActor("Колобок", "Владимиренкович", "Иванов");
        // в ТЗ написано: "Попробуйте заменить в другом спектакле несуществующего актёра"




    }


}
