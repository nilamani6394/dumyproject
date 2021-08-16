package com.dumy.dumyproject.entity

import javax.persistence.*
@Entity
data class Product_Entity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=-1,
    val name:String?="",
    val tags:String?="",
    val price:Int?,
    val description:String?="",
    @ManyToOne
    @JoinColumn(name="category_id")
    val category:Category_Entity
)
