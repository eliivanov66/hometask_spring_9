package ru.example.hometask_9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GatewayController {

    @RequestMapping("/fallback")
    public String greeting(String message) {
        return "Ups. Fallback ";
    }
}
