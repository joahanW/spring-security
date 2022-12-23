/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MSI-JO
 */
@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Good Bye and see you later");
    }
}
