package projekt.modul_151.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Dies ist das model für den Artikelinhalt.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Entity(name = "article_Content")
@Table(name = "article_Content")
public class ArticleContent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_articleContent")
    @SequenceGenerator(name = "seq_articleContent", allocationSize = 10)
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private Double price;

    public ArticleContent() {
    }

    /**
     * eine weitere überladung von Article content mit name & preis
     *
     * @param name
     * @param price
     */
    public ArticleContent(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
