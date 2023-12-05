package serie11.esercizio01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/*
create table book (
    id IDENTITY NOT NULL,
    title varchar2(50),
    pub_year integer,
    publisher varchar2(20),
    firstname varchar2(20),
    lastname varchar2(20)
);
 */
public class Main {
    static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("Esercizio01");
    public static void main(String[] args) {

        insertBook("Carrie", 1974, "Doubleday", "Stephen", "King");
        insertBook("Shining", 1977, "Doubleday", "Stephen", "King");
        insertBook("IT", 1986, "Viking", "Stephen", "King");
        insertBook("Moby dick", 1851, "Richard Bentley", "Herman", "Melville");
        insertBook("Siddhartha", 1922, "Suhrkamp Verlag", "Hermann", "Hesse");

        System.out.println();
        System.out.println("book(s)");
        for (int i = 1; i <= 5; i++)
            System.out.println(getBookById(Long.valueOf(i)));
    }

    /**
     * Inserts a new book into the database with the specified details.
     *
     * @param title      The title of the book.
     * @param year       The year of publication of the book.
     * @param publisher  The publisher of the book.
     * @param firstName  The first name of the author.
     * @param lastName   The last name of the author.
     * @return The newly inserted Book object.
     */
    private static Book insertBook(String title, int year, String publisher, String firstName, String lastName) {

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Book book = new Book();
        book.setTitle(title);
        book.setYear(year);
        book.setPublisher(publisher);
        book.setFirstName(firstName);
        book.setLastName(lastName);
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    /**
     * Retrieves a book from the database based on the specified ID.
     *
     * @param id The unique identifier of the book to retrieve.
     * @return The Book object associated with the specified ID, or null if not found.
     */
    private static Book getBookById(final Long id) {
        EntityManager entityManager = factory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Book book = entityManager.find(Book.class, id);
            entityManager.getTransaction().commit();
            return book;
        } catch (IllegalArgumentException e){
            e.getStackTrace();
            return null;
        } finally {
            if (entityManager != null && entityManager.isOpen()){
                entityManager.close();
            }
        }
    }
}
