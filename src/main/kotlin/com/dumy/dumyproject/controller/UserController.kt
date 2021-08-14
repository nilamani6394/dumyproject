package com.dumy.dumyproject.controller

import com.dumy.dumyproject.entity.UserEntity
import com.dumy.dumyproject.model.ReqUser
import com.dumy.dumyproject.model.res.ResUser
import com.dumy.dumyproject.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import kotlin.random.Random

@RestController
@RequestMapping("/user")
class UserController {
    @Autowired
    private lateinit var userRepository:UserRepository
    @GetMapping("/userTest")
    fun getDemo():String{
        return "This is UserController"
    }
    @PostMapping("/signup")
    fun signUp(@ModelAttribute request:ReqUser):ResponseEntity<*>{
        val newUser=UserEntity(
            name = request.name,
            username = request.username,
            password = request.password,
            otp = Random.nextInt(11111,999999),
            contact = request.contact
        )
        val saveNewUser=userRepository.save(newUser)
        val resUser=ResUser(saveNewUser.name,
            saveNewUser.username,
            saveNewUser.password,
            saveNewUser.otp,
            saveNewUser.contact
        )
        return ResponseEntity(resUser,HttpStatus.OK)
    }
}