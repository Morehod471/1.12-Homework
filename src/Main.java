public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Aleksandr", "Pushkin");
        Author bonk = new Author("John", "Bonk");
        System.out.println("pushkin.getName() = " + pushkin.getName());
        Book lukomorie = new Book("Lukomorie", pushkin, 1828);
        Book englishForDummies = new Book("English", bonk, 1976);
        lukomorie.setPublishingYear(1829);
        System.out.println("lukomorie.publishingYear = " + lukomorie.getPublishingYear());
        System.out.println("englishForDummies.author = " + englishForDummies.getAuthor());
        System.out.println("lukomorie.author = " + lukomorie.getAuthor());
    }
}