package com.dumy.dumyproject.model.res

data class ResUser(
    val name:String?="",
    val username:String?="",
    val password:String?="",
    val otp:Int?=0,
    val contact:Long?=1
)
