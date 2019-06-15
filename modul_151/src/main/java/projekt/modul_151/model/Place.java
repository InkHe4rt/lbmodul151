package projekt.modul_151.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Dies ist das model für den Ort.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Entity(name = "place")
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_place")
    @SequenceGenerator(name = "seq_place", allocationSize = 10)
    private Long id;
    @NotNull
    @NotEmpty
    @Size(max = 4)
    private String zip;
    @NotNull
    @NotEmpty
    private String city;

    public Place() {
    }

    public Place(String zip, String city) {
        this.zip = zip;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
