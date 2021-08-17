package com.dumy.dumyproject.entity

import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Size

@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=-1,
    val name:String?="",
    @Column(unique = true,name = "email_Id")
    @Email
    val username:String?="",
    @Size(min = 2 ,max = 8)
    val password:String?="",
    val otp:Int?=0,
    val isVerified:Boolean?=false,
    @Column(unique = true)
    val contact:Long?=1
)
