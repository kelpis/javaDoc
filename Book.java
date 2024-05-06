/**
 * Clase Book (libro) que almacenada datos de libros.
 * Esta clase contiene datos del titulo , autor y año del libro
 * @author Gemma Morais Villar
 * @version 0.1 06/05/2024
 */
public class Book {
    /**
     * Nombre del libro
     */
    private String title;
    /**
     * Autor del libro
     */
    private String author;
    /**
     * Año de publicacion
     */
    private int year;

    /**
     * Constructor de la clase Book
     * @param title Titulo libro
     * @param author Autor libro
     * @param year Año publicacion
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * Metodo get que devuelve el titulo del libro
     * @return Titulo libro
     */
    public String getTitle() {
        return title;
    }

    /**
     * Metodo set para modificar el parsmetro titulo
     * @param title Titulo libro
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Metodo get que devuelve el autor del libro
     * @return Autor libro
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Metodo set para modificar el parametro autor libro
     * @param author Autor libro
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Metodo get que devuelve el año de publicacion del libro
     * @return year libro
     */
    public int getYear() {
        return year;
    }

    /**
     * Metodo set para modificar el parametro año de publicacion del libro
     * @param year Autor libro
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Metodo que convierte en String objetos de la clase BOOK
     * @return String con los campos titulo,autor y año.
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
