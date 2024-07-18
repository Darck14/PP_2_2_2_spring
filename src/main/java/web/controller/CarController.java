package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping ("/car")
public class CarController {

    private CarService carServiceImp;

    @Autowired
    public CarController(CarService carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping()
    public String getList(@RequestParam(value = "count", defaultValue = "5") Integer num, Model model) {
        model.addAttribute("car", carServiceImp.show(num));
        return "car";
    }

//    @GetMapping("/count={num}")
//    public String show (@PathVariable("num") int num, Model model) {
//        model.addAttribute("car", carServiceImp.show(num));
//        return "car";
//    }
}
