package tourism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("attractions")
public class TouristController {

    private TouristService touristService;
    public TouristController(){
        this.touristService = new TouristService();
    }

    @GetMapping(path = "")
    public ResponseEntity<List<TouristAttraction>> getTouristAttractions() {
        List attractions = touristService.getTouristAttrations();
        return new ResponseEntity<List<TouristAttraction>>(attractions, HttpStatus.OK);
    }


}
