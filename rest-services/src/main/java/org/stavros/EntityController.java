package org.stavros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

    @GetMapping("/entity")
    public FormData getPerson() {
        return new FormData("Stavros", "sanastasiadis@gmail.com");
    }
}
