package com.example.demo.diceGame.choijaewoo;

import com.example.demo.diceGame.sanghoonlee.entity.Dice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// log.debug 혹은 log.info()로 디버깅 메시지 출력 지원
@Slf4j
// Frontend와 데이터를 주고 받기 위해 사용함
// 부가적으로 입력해야하는 번거로운 작업들을 최소화 할 수 있음
@RestController
@RequestMapping("/choijaewoo")
public class JaeWooController {

    @GetMapping("/test00")
    public void justForTest () {
        // sout
        System.out.println("justForTest()");

        Dice dice = new Dice();
        System.out.println("dice = " + dice);

        return;
    }
}
