/*
package com.dumy.dumyproject.service

import com.dumy.dumyproject.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import kotlin.jvm.Throws

@Service
class MyUserDetailsService : UserDetailsService {
    @Autowired
    private lateinit var userRepo:UserRepository
    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String?): UserDetails {
        val existingUser=userRepo.findByUserName(username)
            ?:throw UsernameNotFoundException("Cannot Find the UserName")
        return User(existingUser.username,existingUser.password,ArrayList())
    }
}*/
