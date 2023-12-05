package serie11.esercizio01;

import javax.persistence.*;

@Entity
public class Book {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "years")
    private int year;
    @Column
    private String title;
    @Column
    private String publisher;
    @Column
    private String firstName;
    @Column
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Book [id=%s, year=%s, title=%s, publisher=%s, first_name=%s, last_name=%s]", id, year, title, publisher, firstName, lastName);
    }
}
