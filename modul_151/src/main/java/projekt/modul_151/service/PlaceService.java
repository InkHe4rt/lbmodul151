package projekt.modul_151.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.modul_151.model.Place;
import projekt.modul_151.repository.PlaceRepository;

import javax.validation.Valid;
import java.util.Optional;


@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public Long addPlace(@Valid Place place){

        return placeRepository.saveAndFlush(place).getId();
    }

    public Place getplace(Long id){
        Place place = new Place();
        if(id != null){
            Optional<Place> optionalPlace = placeRepository.findById(id);
            if(optionalPlace.isPresent())
                place = optionalPlace.get();
        }
        return place;
    }

    public Place getPlace(String city){
        Place place = new Place();
        if(city != null){
            Optional<Place> optionalPlace = placeRepository.findByCity(city);
            if(optionalPlace.isPresent())
                place = optionalPlace.get();
        }
        return place;
    }
}
