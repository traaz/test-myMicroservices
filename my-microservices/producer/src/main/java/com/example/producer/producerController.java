package com.example.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/producer")
public class producerController {

    @GetMapping
    public String giveName(){
        String[] nameArray = {"Hasan", "Mehmet", "Okan", "Kerem"};
        Random randomIndex = new Random();
        int n = randomIndex.nextInt(4);
        return nameArray[n];
    }
}
