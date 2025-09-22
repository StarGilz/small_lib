package com.small_library.loving_hands.main.controller;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/")
    public String main() {
        return "book/list";
    }
    
}
