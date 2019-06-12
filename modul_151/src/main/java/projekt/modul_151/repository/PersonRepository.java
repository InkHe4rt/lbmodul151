package projekt.modul_151.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projekt.modul_151.model.Person;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>, CrudRepository<Person,Integer> {

    Optional<Person> findById(Long id);

    Optional<Person> findByEmail(String email);
}
