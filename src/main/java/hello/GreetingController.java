package hello;

import static org.assertj.core.api.Assertions.linesOf;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/data")
    public List<String> dataNegara(
    		@RequestParam("q") int prefix){
    	List<String> data = new ArrayList<String>();
    	data.add("Indonesia");
    	data.add("Malaysia");
    	data.add("Brunei");
    	data.add(("Timor Leste"));
    	
    	return data.stream()
//    			.filter(line->line.startsWith(prefix))
    			.filter(line->line.length() >= prefix)
    			.collect(Collectors.toList());
    }
}