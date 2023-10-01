package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") //URL 연결 요청
    public String niceToMeetYou(Model model){
        //Model은 MVC 패턴에서 데이터를 관리하는 역할

        model.addAttribute("username", "JunHyuk");
        //model 객체가 "JunHyuk" 값을 "username"에 연결해 웹 브라우저로 보냄

        return "greetings"; //greetings.html 반환
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "준혁");
        return "goodbye";
    }
}

//뷰 템플릿이란 웹 페이지를 일종의 틀로 만든 것이다.
//컨트롤러는 클라이언트의 요청을 받아 서버에서 이를 처리하는 역할을 한다.
//모델은 뷰 템플릿에서 사용되는 데이터를 관리하는 역할을 한다.
//@Controller는 이 클래스가 컨트롤러임을 선언한다.
//@GetMapping은 클라이언트의 URL 요청을 받아 특정 컨트롤러의 메서드가 처리하게 한다.