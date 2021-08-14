package com.dumy.dumyproject.entity

import javax.persistence.*

@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=-1,
    val name:String?="",
    @Column(unique = true,name = "email_Id")
    val username:String?="",
    val password:String?="",
    val otp:Int?=0,
    @Column(unique = true)
    val contact:Long?=1
)
