package me.tedory.springsecuritydemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminProtectedRestController {

    @GetMapping("/hiddenmessage")
    public ResponseEntity<?> getAdminProtectedGreeting() {
        return ResponseEntity.ok("this is a hidden message!");
    }
}