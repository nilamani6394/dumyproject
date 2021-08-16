package com.dumy.dumyproject.model.req

import com.dumy.dumyproject.entity.Product_Entity

data class ReqCategory(
    val name:String?="",
    val product:Product_Entity?
)
