package com.example.demo.diceGame;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//log.debug 혹은 log.info()로 디버깅 메시지 출력 지원
@Slf4j
// Frontend와 데이터를 주고 받기 위해 사용함
// 부가적으로 입력해야하는 번거로운 작업들을 최소화 할 수 있음
@RestController
@RequiredArgsConstructor
@RequestMapping("/wonjungkim")
public class wonjungkimController {

    @GetMapping("/test")
    public void justForTest () {

        // sout
        System.out.println("justForTest()");

    }
//    return;
}