public class Book {

    public String author;
    public String titleBook;
    private String publisher;
    public int yearPublished;

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }


    public Book() {
        author="Jaminton Moreno";
    }

    public Book(String author) {
        this.author=author;
    }

    public String nameAuthor(){
        return this.author;
    }

}
