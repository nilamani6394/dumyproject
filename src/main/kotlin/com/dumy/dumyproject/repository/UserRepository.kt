package com.dumy.dumyproject.repository

import com.dumy.dumyproject.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity,Long> {
}