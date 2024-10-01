package ie.atu.lab1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person") //only deals with url's that contain person: http://localhost:8080/person/message
public class Week3 {

    @GetMapping("/message")
    public String getMessage(){
        return "Some Message";
    }

    @GetMapping("/details")
    public String getDetails(@RequestParam String name, @RequestParam int age){
        return "Name: "+name+" Age: "+age;
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello "+name;
    }

}
