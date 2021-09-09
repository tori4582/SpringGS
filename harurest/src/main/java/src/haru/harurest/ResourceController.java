package src.haru.harurest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/*
    @RestController:
        HTTPRequest from the client will be handled by a controller which marked 
        with annotation. And marking the class as a controller where the methods
        return domain objects (instead of view).
        Could be replaced with shorthands: @Controller, @ResponseBody   

    These annotations help to eliminate manipulation with XML configuration.
*/
@RestController
public class ResourceController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
        @GetMapping([str]):
            Marking that this method will handle HTTP GET requests
            - str (optional): the url subdirectory 

        @RequestParam:
            bind the value of the query string parameter "name" into the "name" 
            of the getRequest(). (If "name" is blank, "defaultValue" will be bind)

    */
    @GetMapping("/hello")
    public HaruService getRequest(
            @RequestParam(value="name", defaultValue="from Matrix") String name) {
        return new HaruService(counter.incrementAndGet(), 
                               String.format(template, name));
    }

    /*
        @PostMapping:
            Marking that this method will handle HTTP POST requests

        In general cases, we can use @RequestMapping(method=/REQUEST/)
    */
    //@PostMapping(value="")
    public void postRequest() {
        // still not doing yet
    }

}
