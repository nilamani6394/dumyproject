/*
package com.dumy.dumyproject.filter

import com.dumy.dumyproject.service.MyUserDetailsService
import com.dumy.dumyproject.util.JwtTokenUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtRequestFilter : OncePerRequestFilter() {
    @Autowired
    private lateinit var jwtTokenUtil: JwtTokenUtil
    private lateinit var myUserDetailsService: MyUserDetailsService
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val requestTokenHeader=request.getHeader("Authorization")
        val userName:String?=null,
        var jwtToken:String?=null

        if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer "))
            jwtToken=requestTokenHeader.substring(7)
        try {

        }catch (){}

    }
}*/
