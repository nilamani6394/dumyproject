package com.dumy.dumyproject.repository

import com.dumy.dumyproject.entity.UserEntity
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserRepository : JpaRepository<UserEntity,Long> {
    //fun findByusername(username:String?,password:String?):UserEntity?

    /*@Modifying
    @Query("Update user_entity SET u.username like %:username%")
    fun isVerifiedOtp(@Param("username") username: Boolean, otp:Int?):Boolean?
    fun findByUsername(username: String?): UserEntity?*/
}