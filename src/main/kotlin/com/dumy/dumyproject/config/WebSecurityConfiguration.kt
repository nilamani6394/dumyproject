package com.dumy.dumyproject.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy

@Configuration
@EnableWebSecurity
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http?.csrf()?.disable()
            ?.authorizeRequests()
            ?.antMatchers("/dummyTest/dummy","/user/**")
            ?.permitAll()
            ?.anyRequest()
            ?.authenticated()
            ?.and()
            ?.sessionManagement()
            ?.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }
}