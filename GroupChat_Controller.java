import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    private List<String> messages = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/messages/{page}")
    public List<String> getMessages(@PathVariable int page) {
        int start = (page - 1) * 10;
        int end = start + 10;
        return messages.subList(start, end);
    }

    @PostMapping("/messages")
    public void postMessage(@RequestBody String message) {
        messages.add(message);
    }
}
