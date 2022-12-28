package Task1;

public enum Season {

    SUMMER,
    WINTER,
    AUTUMN,
    SPRING;

    private String title;

    Season() {
        this(null);
    }

    Season(String title) {
        this.title = title;
    }



    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Season{" +
                "title='" + title + '\'' +
                '}';
    }
}