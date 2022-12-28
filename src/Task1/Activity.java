package Task1;

public class Activity {

    public Activity(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Лето! Пора отправляться купаться и загорать!");
                break;
            case WINTER:
                System.out.println("Зима! Пора наряжать ёлки и лепить снеговика!");
                break;
            case AUTUMN:
                System.out.println("Осень! Давай устроим фотосессию в прекрасных рыжих тонах?");
                break;
            case SPRING:
                System.out.println("Весна! Пошли греться в первых весенних лучиках солнца?");
                break;
        }

    }
}