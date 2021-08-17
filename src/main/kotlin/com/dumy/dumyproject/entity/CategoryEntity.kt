package com.dumy.dumyproject.entity

import javax.persistence.*

@Entity
data class CategoryEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=-1,
    val name:String?="",
    @OneToMany(mappedBy = "category")
    val product:List<ProductEntity>?
)
