package com.dumy.dumyproject.controller

import com.dumy.dumyproject.entity.UserEntity
import com.dumy.dumyproject.isValid
import com.dumy.dumyproject.isValidPassword
import com.dumy.dumyproject.model.req.ReqUser
import com.dumy.dumyproject.model.req.ReqVerify
import com.dumy.dumyproject.model.res.ResMessage
import com.dumy.dumyproject.model.res.ResUser
import com.dumy.dumyproject.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
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
    fun signUp(@Valid@ModelAttribute request: ReqUser):ResponseEntity<*>{
        val map=HashMap<String,String>()
        if(request.name?.isEmpty() == true){
            map["name"]="Name cannot be empty"
        }
        if(isValid(request.username)){
            map["username"]="Enter a valid Username"
        }
        if(request.password.isNullOrEmpty() &&isValidPassword(request.password)){
            map["password"]="Enter a valid password"
        }
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
    /*@GetMapping("/verified")
   fun verifyUser(@ModelAttribute reqVerify: ReqVerify):ResponseEntity<*>{
       val curUser=userRepository.findByUsername(reqVerify.username)
      if (curUser?.equals(reqVerify.username) == true && curUser.equals(reqVerify.otp)){
         val updateUser=userRepository.isVerifiedOtp(true,otp = reqVerify.otp)
      }
       return ResponseEntity(ResMessage("you are a verified user"),HttpStatus.OK)
   }*/

}