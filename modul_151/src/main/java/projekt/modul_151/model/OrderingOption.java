package projekt.modul_151.model;

import javax.persistence.*;

/**
 * Dies ist das model die Bestelloption.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Entity(name = "ordering_Option")
@Table(name = "ordering_Option")
public class OrderingOption {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orderingOption")
    @SequenceGenerator(name = "seq_orderingOption", allocationSize = 10)
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn (name = "orderingOption_orderPositionFk")
    private OrderingPosition ordPosFk;

    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn (name = "orderingOption_articleContentFk")
    private ArticleContent artConFK;

    public OrderingOption() {
    }

    // nicht sicher ob ich den brauche später kontrollieren
    public OrderingOption(OrderingPosition ordPosFk, ArticleContent artConFK) {
        this.ordPosFk = ordPosFk;
        this.artConFK = artConFK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderingPosition getOrdPosFk() {
        return ordPosFk;
    }

    public void setOrdPosFk(OrderingPosition ordPosFk) {
        this.ordPosFk = ordPosFk;
    }

    public ArticleContent getArtConFK() {
        return artConFK;
    }

    public void setArtConFK(ArticleContent artConFK) {
        this.artConFK = artConFK;
    }
}
