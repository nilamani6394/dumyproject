package com.dumy.dumyproject.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dummyTest")
class HomeController {
    @GetMapping("/dummy")
    fun dummy():String{
        return "Hai I am dummy"
    }
}