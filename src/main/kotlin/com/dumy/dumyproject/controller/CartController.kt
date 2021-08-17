package com.dumy.dumyproject.controller

import com.dumy.dumyproject.repository.ProductRepository
import com.dumy.dumyproject.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/addTOCart")
class CartController {
    @Autowired
    private lateinit var userRepository: UserRepository
    @Autowired
    private lateinit var productRepository: ProductRepository
   /* fun addToCart(@PathVariable("user_id")user_id:Long,@PathVariable("product_id")id:Long):ResponseEntity<*>{

    }*/
    @GetMapping("/getMessage")
    fun getMessage():String{
        return "Hai This is for test case"
    }
}