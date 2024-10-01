package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person") //only deals with url's that contain person: http://localhost:8080/person/message
public class Week3 {

    @GetMapping("/message")
    public String getMessage(){
        return "Some Message";
    }

    @GetMapping("/details")
    public String getDetails(){
        return "Some other Message";
    }

    @GetMapping("/hello/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello "+name;
    }

}
