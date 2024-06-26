package org.stavros;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {

    @PostMapping(value = "/submit", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> submitData(@ModelAttribute FormData formData) {
        String response = "Received data: name: " + formData.getName() + ", email: " + formData.getEmail();
        return ResponseEntity.ok(response);
    }
}

