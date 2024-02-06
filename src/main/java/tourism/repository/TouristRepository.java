package tourism.repository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private ArrayList<TouristAttraction> attractions;

    public TouristRepository(){
        this.attractions = new ArrayList<>();
        attractions.add(new TouristAttraction("Guldbar", "Fredagscafé"));
        attractions.add(new TouristAttraction("Hatten", "God bar"));
        attractions.add(new TouristAttraction("Bip bip bar", "Dyr bar"));
    }

public List<TouristAttraction> getTouristAttractions(){
        return attractions;
}

public TouristAttraction getTouristAttraction (String name){
        for (TouristAttraction t : attractions){
            if (name.equals(t.getName())){
                return t;
            }
        }
        return null;
}


}
