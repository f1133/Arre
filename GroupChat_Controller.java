
// I'm versed with SpringBoot so my Controller is in SpringBoot Hope that's not a problem
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private MessageRepository messageRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/messages")
    public Page<Message> getMessages(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size) {
        return messageRepository.findAll(PageRequest.of(page, size, Sort.by("createdAt").descending()));
    }

    @PostMapping("/messages")
    public Message postMessage(@Valid @RequestBody Message message) {
        return messageRepository.save(message);
    }
}
