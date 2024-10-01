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

    @GetMapping("/calculate")
    public String calculation(@RequestParam int num1, @RequestParam int num2,@RequestParam String operation) {

        switch(operation){

            case "add":
                return "Operation: "+operation+" total: "+ (num1 +num2);

            case "subtract":
                return "Operation: "+operation+" total: "+ (num1-num2);

            case "multiply":
                return "Operation: "+operation+" total: "+ (num1*num2);

            case "divide":
                if (num2==0){
                    return "Error, can't divide by 0";
                }

                    return "Operation: " + operation + " total: " + (num1 / num2);

            default:
                return"Error";
        }
    }


}
