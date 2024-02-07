package tourism.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(path = "/{name}")
    public ResponseEntity<TouristAttraction> getAttraction(@PathVariable String name) {
        TouristAttraction t = touristService.getTouristAttraction(name);
        return new ResponseEntity<TouristAttraction>(t, HttpStatus.OK);
    }

    /*@GetMapping(path = "/add")

    public ResponseEntity<TouristAttraction> addAttraction(@PathVariable String name, @PathVariable String description) {
        TouristAttraction t = touristService.addAttraction(name, description);
        return new ResponseEntity<TouristAttraction>(touristService.addAttraction(name, description), HttpStatus.OK);
    }*/

    @GetMapping("/add")//dette er et endpoint
    public ResponseEntity<TouristAttraction> calculate(@RequestParam Map<String, String> numbers) {
        String name = numbers.get("name");
        String description = numbers.get("description");
        return new ResponseEntity<TouristAttraction>(touristService.addAttraction(name, description), HttpStatus.OK);


    }
}

