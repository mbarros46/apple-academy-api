package br.senac.sp.appleacademyapi.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> root() {
        return Map.of(
            "app", "apple-academy-api",
            "status", "UP"
        );
    }
}