package com.example.demo.diceGame.kieun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/kieun")
public class KieunController {
    @GetMapping("/test")
    public void justForTest2(){
        System.out.println("justForTest()");
        return;
    }
}
