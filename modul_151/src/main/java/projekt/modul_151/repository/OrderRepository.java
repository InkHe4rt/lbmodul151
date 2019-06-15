package projekt.modul_151.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projekt.modul_151.model.Ordering;

import java.util.Optional;

/**
 * Dies ist der Service für die Bestellung.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Repository
public interface OrderRepository extends JpaRepository<Ordering,Integer>, CrudRepository<Ordering,Integer> {

    Optional<Ordering> findById(Long id);

    Optional<Ordering> findByComment(String comment);
}
