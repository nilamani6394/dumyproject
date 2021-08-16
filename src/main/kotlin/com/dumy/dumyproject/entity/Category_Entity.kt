package com.dumy.dumyproject.entity

import javax.persistence.*

@Entity
data class Category_Entity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=-1,
    val name:String?="",
    @OneToMany(mappedBy = "category")
    val product:List<Product_Entity>?
)
