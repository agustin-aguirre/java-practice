public class Book {

    String title;
    String author;
    int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void printInformation() {
        System.out.printf("Title: %s - Author: %s - Year Publish: %d%n", title, author, yearPublished);
    }
}
