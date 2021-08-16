package com.dumy.dumyproject.repository

import com.dumy.dumyproject.entity.Product_Entity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<Product_Entity,Long> {
}