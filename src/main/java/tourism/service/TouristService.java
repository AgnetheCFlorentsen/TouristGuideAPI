package tourism.service;

import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;

public class TouristService {
    private TouristRepository repository;
    public TouristService () {
        repository = new TouristRepository();
    }
    public List <TouristAttraction> getTouristAttrations (){
        return repository.getTouristAttractions();
    }

    public TouristAttraction getTouristAttraction (String name) {
        return repository.getTouristAttraction(name);
    }


}
