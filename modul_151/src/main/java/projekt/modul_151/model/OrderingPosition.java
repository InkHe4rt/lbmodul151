package projekt.modul_151.model;

import javax.persistence.*;

/**
 * Dies ist das model für die Bestellposition.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Entity(name = "ordering_Position")
@Table(name = "ordering_Position")
public class OrderingPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orderingPosition")
    @SequenceGenerator(name = "seq_orderingPosition", allocationSize = 10)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn (name = "orderingPosition_orderFk")
    private Ordering ordFk;

    @ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn (name = "orderingPosition_orderOptionFk")
    private OrderingOption ordOptFK;

    public OrderingPosition() {
    }

    /**
     * diese überladene methode wird ebenfalls nicht gebraucht in meiner jetzigen version.
     *
     * @param ordFk
     * @param ordOptFK
     */
    public OrderingPosition(Ordering ordFk, OrderingOption ordOptFK) {
//        this.ordFk = ordFk;
//        this.ordOptFK = ordOptFK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ordering getOrdFk() {
        return ordFk;
    }

    public void setOrdFk(Ordering ordFk) {
        this.ordFk = ordFk;
    }

    public OrderingOption getOrdOptFK() {
        return ordOptFK;
    }

    public void setOrdOptFK(OrderingOption ordOptFK) {
        this.ordOptFK = ordOptFK;
    }
}
