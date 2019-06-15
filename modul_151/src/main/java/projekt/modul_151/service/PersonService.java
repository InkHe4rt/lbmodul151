package projekt.modul_151.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.modul_151.model.Person;
import projekt.modul_151.repository.PersonRepository;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Dies ist der Service für die Person.
 *
 *
 * @author  Dubler Michel
 * @version 1.0
 * @since   2019-06-15
 *
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Long addPerson(@Valid Person person){

        return personRepository.saveAndFlush(person).getId();
    }

    public Person getPerson(Long id){
        Person person = new Person();
        if(id != null){
            Optional<Person> optionalPerson = personRepository.findById(id);
            if(optionalPerson.isPresent())
                person = optionalPerson.get();
        }
        return person;
    }

    public Person getPerson(String email){
        Person person = new Person();
        if(email != null){
            Optional<Person> optionalPerson = personRepository.findByEmail(email);
            if(optionalPerson.isPresent())
                person = optionalPerson.get();
        }
        return person;
    }
}
