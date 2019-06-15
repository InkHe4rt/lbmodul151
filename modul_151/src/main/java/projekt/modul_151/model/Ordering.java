package projekt.modul_151.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Dies ist das model für die Bestellung.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Entity(name = "ordering")
@Table(name = "ordering")
public class Ordering {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ordering")
    @SequenceGenerator(name = "seq_ordering", allocationSize = 10)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn (name = "ordering_personFk")
    private Person perFk;

    @NotNull
    @NotEmpty
    private String date;

    private String comment;

    public Ordering() {
    }

    /**
     * überladung von der bestellung.
     *
     * @param perFk
     * @param date
     * @param comment
     */
    public Ordering(Person perFk, String date, String comment) {
        this.perFk = perFk;
        this.date = date;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerFk() {
        return perFk;
    }

    public void setPerFk(Person perFk) {
        this.perFk = perFk;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
