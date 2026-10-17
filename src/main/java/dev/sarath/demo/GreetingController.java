package dev.sarath.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/api/health")
    public Status health() {
        return new Status("ok");
    }

    @GetMapping("/api/greet")
    public Greeting greet(@RequestParam(defaultValue = "world") String name) {
        return new Greeting("Hello, " + name + "!");
    }

    public record Status(String status) {}
    public record Greeting(String message) {}
}
