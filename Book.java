/*
 * Representa la clase Libro y sus principales atributos
 */
public class Book {

    /*
     * Representa los atributos de la clase Libro.
     */
    protected String author;
    public String titleBook;
    private String publisher;
    public int yearPublished;

    /*
     * Permite darle un valor al atributo privado de la clase Libro.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /*
     * Permite mostrar el valor al atributo privado de la clase Libro.
     */
    public String getPublisher() {
        return publisher;
    }

    /*
     * Crea una instancia de la clase Libro.
     */
    public Book() {
        author="Jaminton Moreno";
    }

    /*
     * Asigna un valor al atributo autor.
     * @param accountNumber argumento que tomará el atributo.
     */
    public Book(String author) {
        this.author=author;
    }

    /*
     * Método que muestra el valor del atributo autor.
     * @return devuelve el resultado de la operación.
     */
    public String nameAuthor(){
        return this.author;
    }

}
