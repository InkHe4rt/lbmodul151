package projekt.modul_151.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Dies ist das model für die Artikel.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Entity(name = "article")
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_article")
    @SequenceGenerator(name = "seq_article", allocationSize = 10)
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private Double price;

    /**
     * ich wollte hier ursprünglich eine many to many verbindung machen aber es gab damit probleme die ich nicht lösen konnte.
     * wie auch mit der arrayliste.
     */
//    @ManyToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.ALL})
//    @JoinColumn (name = "article_articleContentFk")
//    private List<Article> article = new ArrayList<>();


    public Article() {
    }

    /**
     * Dies ist wieder eine überladung mit den attributen name und preis,
     * wobei ich preis leider nicht mehr in meinem code nutzen werde da mir die zeit nicht dafür gereicht hat.
     *
     * @param name
     * @param price
     */
    public Article(String name, Double price) {
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

//    public List<Article> getArticle() {
//        return article;
//    }
//
//    public void setArticle(List<Article> article) {
//        this.article = article;
//    }
}
