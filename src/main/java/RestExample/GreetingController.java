package RestExample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final String template = "Good morning, %s...";

    @RequestMapping("/greeting")
    public Greeting greeting (@RequestParam(value="name", defaultValue = "Honey") String name){
        return  new Greeting(String.format(template, name));
    }
}
