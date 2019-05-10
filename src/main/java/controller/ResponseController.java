package controller;

import model.Face;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

    private static final String baseTemplate = "%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/faces")
    public Face face(@RequestParam(value="id") long id) {
        return new Face(id, "This is a test");
    }

}
