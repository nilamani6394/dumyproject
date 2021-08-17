package com.dumy.dumyproject.entity

import javax.persistence.*
@Entity
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=-1,
    val name:String?="",
    val quantity:Int?,
    val tags:String?="",
    val price:Int?,
    val description:String?="",
    @ManyToOne
    @JoinColumn(name="category_id")
    val category:CategoryEntity
)
