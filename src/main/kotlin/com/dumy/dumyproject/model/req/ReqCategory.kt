package com.dumy.dumyproject.model.req

import com.dumy.dumyproject.entity.ProductEntity

data class ReqCategory(
    val name:String?="",
    val product:ProductEntity?
)
