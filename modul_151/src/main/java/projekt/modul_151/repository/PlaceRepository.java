package projekt.modul_151.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projekt.modul_151.model.Person;
import projekt.modul_151.model.Place;

import java.util.Optional;


@Repository
public interface PlaceRepository extends JpaRepository<Place,Integer>, CrudRepository<Place,Integer> {

    Optional<Place> findById(Long id);

    Optional<Place> findByCity(String city);
}
