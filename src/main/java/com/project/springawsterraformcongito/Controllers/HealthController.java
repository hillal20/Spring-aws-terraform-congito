package com.project.springawsterraformcongito.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Server is up");
    }
}
