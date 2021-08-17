package com.dumy.dumyproject.model.req

import com.dumy.dumyproject.entity.CategoryEntity

data class ReqProduct(
    val name:String?="",
    val quantity:Int?=0,
    val tags:String?="",
    val price:Int?=0,
    val description:String?="",
    val category_id:CategoryEntity
    )
