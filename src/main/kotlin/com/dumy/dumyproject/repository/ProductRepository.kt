package com.dumy.dumyproject.repository

import com.dumy.dumyproject.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ProductRepository:JpaRepository<ProductEntity,Long> {
    @Query("select p from ProductEntity p where p.tags like %:keyword%")
    fun searchProduct(@Param("keyword") keyword: String): List<ProductEntity>?
}