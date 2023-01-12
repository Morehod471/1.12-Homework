public class Book {
    private final String title;
    private Author Author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.Author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return Author.getName() + " " + Author.getSurname();
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
