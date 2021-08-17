package com.dumy.dumyproject.controller

import com.dumy.dumyproject.entity.ProductEntity
import com.dumy.dumyproject.model.req.ReqProduct
import com.dumy.dumyproject.model.res.ResMessage
import com.dumy.dumyproject.model.res.ResProduct
import com.dumy.dumyproject.model.res.ResTags
import com.dumy.dumyproject.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/product")
class ProductController {
    @Autowired
    private lateinit var productRepository: ProductRepository
//    @Autowired
//    private lateinit var categoryRepository: CategoryRepository

    @PostMapping("/addProduct")
    fun addProduct(@ModelAttribute request:ReqProduct):ResponseEntity<*>{
        val newProduct=ProductEntity(
            name = request.name,
            quantity=request.quantity,
            tags = request.tags,
            price = request.price,
            description = request.description,
            category = request.category_id
        )
        val saveProduct=productRepository.save(newProduct)
        val resProduct=ResProduct(saveProduct.id,saveProduct.name,saveProduct.quantity,saveProduct.tags,saveProduct.price,saveProduct.description)
        return ResponseEntity(resProduct,HttpStatus.OK)
    }
    @GetMapping("/{tags}")
    fun findProduct(@PathVariable("tags") tags:String):ResponseEntity<*>{
        val latestProduct=productRepository.searchProduct(tags)
        return if(latestProduct.isNullOrEmpty()){
            ResponseEntity(ResMessage("No Product Found"),HttpStatus.NOT_FOUND)
        }else{
           // val requireProduct=productRepository.searchProduct(tags)
           // val resTags=ResTags(latestProduct.)
            ResponseEntity(ResMessage("Here is the product details"),HttpStatus.OK)
        }
    }
}
