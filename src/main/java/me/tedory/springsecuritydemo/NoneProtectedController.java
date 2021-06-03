package me.tedory.springsecuritydemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class NoneProtectedController {
    @GetMapping("/message")
    public ResponseEntity<?> getGetMessage() {
        return ResponseEntity.ok("this is a none protected message!");
    }
}
