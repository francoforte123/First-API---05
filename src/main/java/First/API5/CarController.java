package First.API5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public CarDTO getNewCar(){
        return new CarDTO("1234", "4x4", 159.00);
    }

    @PostMapping
    public String postNewCar(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO);
        return "create the car";
    }
}
