package com.example.demo.diceGame.leeyonggeun;

import com.example.demo.diceGame.minjun.entity.Dice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/leeyonggeun")
public class LeeYongGeunController {

    @GetMapping("/test")
    public void justForTest() {
        //sout
        System.out.println("justForTest()");

        Dice dice = new Dice();
        System.out.println("dice = " + dice);
        return;
    }
}